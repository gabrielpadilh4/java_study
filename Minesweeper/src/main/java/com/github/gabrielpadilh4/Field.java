package com.github.gabrielpadilh4;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int column;
    private final int row;

    private boolean isMine = false;
    private boolean isOpen = false;
    private boolean marked = false;

    private List<Field> neighbors = new ArrayList<Field>();

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
}
