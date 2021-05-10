package com.github.gabrielpadilh4;

import com.github.gabrielpadilh4.exceptions.ExplosionException;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int column;
    private final int row;

    private boolean isMine = false;
    private boolean isOpen = false;
    private boolean marked = false;

    private final List<Field> neighbors = new ArrayList<>();

    Field(int row, int column) {
        this.row = row;
        this.column = column;
    }

    boolean addNeighbor(Field neighbor) {
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

    void toggleMark() {
        if (!isOpen) {
            marked = !marked;
        }
    }

    boolean open() {
        if (!isOpen && !marked) {
            isOpen = true;

            if (isMine) {
                throw new ExplosionException();
            }

            if (safeNeighborhood()) {
                neighbors.forEach(Field::open);
            }

            return true;
        }

        return false;
    }

    void toggleMine(){
        if(!isMine){
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

    boolean objectiveAchieved(){
        boolean uncovered = !isMine && isOpen;
        boolean fieldProtected = isMine && marked;

        return  uncovered || fieldProtected;
    }

    long neighborsMines(){
        return neighbors.stream().filter(n -> n.isMine).count();
    }

    void restartField(){
        isOpen = false;
        isMine = false;
        marked = false;
    }

    public String toString(){

        if(isOpen && isMine) return "*";

        if(isOpen && neighborsMines() > 0) {
            return Long.toString(neighborsMines());
        }

        if(isOpen) return " ";

        if(marked) return "X";

        return "?";
    }
}
