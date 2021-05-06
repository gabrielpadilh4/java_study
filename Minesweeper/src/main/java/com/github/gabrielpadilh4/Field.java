package com.github.gabrielpadilh4;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int column;
    private final int row;

    private boolean isMine = false;
    private boolean isOpen = false;
    private boolean marked = false;

    private List<Field>  neighbors = new ArrayList<Field>();

    Field(int row, int column){
        this.row = row;
        this.column = column;
    }
}
