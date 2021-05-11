package com.github.gabrielpadilh4;

import com.github.gabrielpadilh4.models.Board;
import com.github.gabrielpadilh4.models.Field;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {

    Board board;

    @BeforeEach
    void initBoard() {
        board = new Board(6, 6, 6);
    }

    @Test
    void testOpenField() {
        board.openField(3, 2);
        board.openField(2, 1);

        long fieldsOpen = board.getFields().stream().filter(f -> f.isOpen()).count();

        Assertions.assertTrue(fieldsOpen > 0);
    }
}
