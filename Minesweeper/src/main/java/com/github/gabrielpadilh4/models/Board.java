package com.github.gabrielpadilh4.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Board {

    private int rows;
    private int columns;
    private int minesCount;

    private final List<Field> fields = new ArrayList<>();

    public Board(int rows, int columns, int minesCount) {
        this.rows = rows;
        this.columns = columns;
        this.minesCount = minesCount;

        generateFields();
        associateNeighbors();
        sortMines();
    }

    public void openField(int row, int column) {
        fields.parallelStream().filter(f -> f.getRow() == row && f.getColumn() == column).findFirst().ifPresent(Field::open);
    }

    public void markField(int row, int column) {
        fields.parallelStream().filter(f -> f.getRow() == row && f.getColumn() == column).findFirst().ifPresent(f -> f.toggleMark());
    }

    public void generateFields() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                fields.add(new Field(row, column));
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
            minesArmed = fields.stream().filter(mined).count();

            int random = (int) (Math.random() * fields.size());

            fields.get(random).toggleMine();

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

    public String toString() {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        for (int row = 0; row < rows; row++) {

            for (int column = 0; column < columns; column++) {
                sb.append(" ");
                sb.append(fields.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
