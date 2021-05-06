package com.github.gabrielpadilh4;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FieldTest {

    private Field field;

    @BeforeEach
    void initField() {
        field = new Field(3, 3);
    }

    @Test
    void testNeighborLeft() {

        Field neighbor = new Field(3, 2);
        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

    @Test
    void testNeighborRight() {

        Field neighbor = new Field(3, 4);

        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

    @Test
    void testNeighborTop() {

        Field neighbor = new Field(2, 3);

        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

    @Test
    void testNeighborDown() {

        Field neighbor = new Field(4, 3);

        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

    @Test
    void testNeighborDiagonalTopLeft() {

        Field neighbor = new Field(2, 2);
        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

    @Test
    void testNeighborDiagonalTopRight() {

        Field neighbor = new Field(2, 4);
        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

    @Test
    void testNeighborDiagonalDownLeft() {

        Field neighbor = new Field(4, 2);
        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

    @Test
    void testNeighborDiagonalDownRight() {

        Field neighbor = new Field(4, 4);
        boolean result = field.addNeighbor(neighbor);

        Assertions.assertTrue(result);

    }

}
