package com.github.gabrielpadilh4.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Board implements IFieldObserver {

    private final int rows;
    private final int columns;
    private final int minesCount;

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

    public void forEachField(Consumer<Field> function) {
        fields.forEach(function);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getMinesCount() {
        return minesCount;
    }

    public void registerObserver(Consumer<Boolean> observer) {
        observers.add(observer);
    }

    private void notifyObservers(boolean result) {
        observers.stream().forEach(b -> b.accept(result));
    }

    public void openField(int row, int column) {
        fields.parallelStream().filter(f -> f.getRow() == row && f.getColumn() == column).findFirst().ifPresent(Field::open);
    }

    private void showMines() {
        fields.stream().filter(f -> f.isMine())
                .filter(f -> !f.isMarked())
                .forEach(f -> f.setOpen(true));
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
        } else if (objectiveAchieved()) {
            notifyObservers(true);
        }
    }
}
