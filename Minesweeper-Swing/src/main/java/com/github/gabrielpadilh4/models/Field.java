package com.github.gabrielpadilh4.models;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int column;
    private final int row;

    private boolean isMine = false;
    private boolean isOpen = false;
    private boolean marked = false;

    private List<Field> neighbors = new ArrayList<>();
    private List<IFieldObserver> observers = new ArrayList<>();

    public Field(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void registerObserver(IFieldObserver observer){
        observers.add(observer);
    }

    private void notifyObservers(FieldEvent event){
        observers.stream().forEach(e -> e.eventOccur(this, event));
    }

    public boolean addNeighbor(Field neighbor) {
        boolean isOtherRow = this.row != neighbor.row;
        boolean isOtherColumn = this.column != neighbor.column;

        boolean diagonal = isOtherRow && isOtherColumn;

        int deltaRow = Math.abs(this.row - neighbor.row);
        int deltaColumn = Math.abs(this.column - neighbor.column);
        int deltaGeneral = deltaColumn + deltaRow;

        if (deltaGeneral == 1 && !diagonal) {
            neighbors.add(neighbor);
            return true;
        }

        if (deltaGeneral == 2 && diagonal) {
            neighbors.add(neighbor);
            return true;
        }

        return false;

    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void toggleMark() {
        if (!isOpen) {
            marked = !marked;

            if(marked){
                notifyObservers(FieldEvent.MARK);
            } else {
                notifyObservers(FieldEvent.UNMARK);
            }
        }
    }

    public boolean open() {
        if (!isOpen && !marked) {
            if (isMine) {
                notifyObservers(FieldEvent.EXPLODE);
                return true;
            }

            setOpen(true);

            if (safeNeighborhood()) {
                neighbors.forEach(Field::open);
            }

            return true;
        }

        return false;
    }

    public void toggleMine() {
        if (!isMine) {
            isMine = true;
        }
    }

    public boolean isMine() {
        return isMine;
    }

    boolean safeNeighborhood() {
        return neighbors.stream().noneMatch(n -> n.isMine);
    }

    public boolean isMarked() {
        return marked;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean objectiveAchieved() {
        boolean uncovered = !isMine && isOpen;
        boolean fieldProtected = isMine && marked;

        return uncovered || fieldProtected;
    }

    public long neighborsMines() {
        return neighbors.stream().filter(n -> n.isMine).count();
    }

    public void restartField() {
        isOpen = false;
        isMine = false;
        marked = false;
    }

    public void  setOpen(boolean open){
        this.isOpen = open;

        if(isOpen){
            notifyObservers(FieldEvent.OPEN);
        }
    }
}
