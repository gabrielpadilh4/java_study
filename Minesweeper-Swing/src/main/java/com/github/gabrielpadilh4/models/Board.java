package com.github.gabrielpadilh4.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Board implements IFieldObserver {

    private int rows;
    private int columns;
    private int minesCount;

    private final List<Field> fields = new ArrayList<>();
    private List<Consumer<Boolean>> observers = new ArrayList<>();

    public Board(int rows, int columns, int minesCount) {
        this.rows = rows;
        this.columns = columns;
        this.minesCount = minesCount;

        generateFields();
        associateNeighbors();
        sortMines();
    }

    public void registerObserver(Consumer<Boolean> observer) {
        observers.add(observer);
    }

    private void notifyObservers(boolean reasult) {
        observers.stream().forEach(b -> b.accept(reasult));
    }

    public void openField(int row, int column) {
        fields.parallelStream().filter(f -> f.getRow() == row && f.getColumn() == column).findFirst().ifPresent(Field::open);
    }

    private void showMines() {
        fields.stream().filter(f -> f.isMine()).
                forEach(f -> f.setOpen(true));
    }

    public void markField(int row, int column) {
        fields.parallelStream().filter(f -> f.getRow() == row && f.getColumn() == column).findFirst().ifPresent(f -> f.toggleMark());
    }

    public void generateFields() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Field field = new Field(row, column);
                field.registerObserver(this);
                fields.add(field);
            }
        }
    }

    public void associateNeighbors() {
        for (Field f1 : fields) {
            for (Field f2 : fields) {
                f1.addNeighbor(f2);
            }
        }
    }

    public void sortMines() {
        long minesArmed = 0;

        Predicate<Field> mined = Field::isMine;

        do {

            int random = (int) (Math.random() * fields.size());

            fields.get(random).toggleMine();

            minesArmed = fields.stream().filter(mined).count();

        } while (minesArmed < minesCount);
    }

    public boolean objectiveAchieved() {
        return fields.stream().allMatch(Field::objectiveAchieved);
    }

    public void restartGame() {
        fields.stream().forEach(Field::restartField);
        sortMines();
    }

    public List<Field> getFields() {
        return fields;
    }

    @Override
    public void eventOccur(Field f, FieldEvent event) {
        if (event == FieldEvent.EXPLODE) {
            showMines();
            notifyObservers(false);
        };

        if (objectiveAchieved()) notifyObservers(true);
    }
}
