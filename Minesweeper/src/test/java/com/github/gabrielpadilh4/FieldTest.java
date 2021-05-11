package com.github.gabrielpadilh4;

import com.github.gabrielpadilh4.exceptions.ExplosionException;
import com.github.gabrielpadilh4.models.Field;
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

    @Test
    void testDefaultValueMarked() {
        Assertions.assertFalse(field.isMarked());
    }

    @Test
    void testToggleMark() {
        field.toggleMark();
        Assertions.assertTrue(field.isMarked());
    }

    @Test
    void testToggleMarkTwice() {
        field.toggleMark();
        field.toggleMark();
        Assertions.assertFalse(field.isMarked());
    }

    @Test
    void testOpenNotMinNotMarked() {
        Assertions.assertTrue(field.open());
    }

    @Test
    void testOpenNotMineMarked() {
        field.toggleMark();
        Assertions.assertFalse(field.open());
    }

    @Test
    void testOpenMineMarked() {
        field.toggleMark();
        field.toggleMine();

        Assertions.assertFalse(field.open());
    }

    @Test
    void testOpenMineNotMarked() {
        field.toggleMine();

        Assertions.assertThrows(ExplosionException.class, () -> field.open());
    }

    @Test
    void testOpenWithNeighbors() {
        Field neighbor1 = new Field(2, 2);
        Field neighborOfNeighbor1 = new Field(1, 1);

        neighbor1.addNeighbor(neighborOfNeighbor1);

        field.addNeighbor(neighbor1);

        field.open();

        Assertions.assertTrue(field.isOpen() && neighborOfNeighbor1.isOpen());
    }

    @Test
    void testOpenWithNeighborsMarked() {
        Field neighbor1 = new Field(2, 2);
        Field neighborOfNeighbor1 = new Field(1, 1);

        neighborOfNeighbor1.toggleMine();

        neighbor1.addNeighbor(neighborOfNeighbor1);

        field.addNeighbor(neighbor1);

        field.open();

        Assertions.assertTrue(field.isOpen() && !neighborOfNeighbor1.isOpen());
    }

    @Test
    void testGetRowColumn(){
        field = new Field(1,1);

        Assertions.assertTrue(field.getColumn() == 1 && field.getRow() == 1);
    }

    @Test
    void testObjectiveAchieved(){
        field = new Field(1,1);

        field.open();

        Assertions.assertTrue(field.objectiveAchieved());
    }


    @Test
    void testRestartField(){

        field = new Field(1,1);

        field.toggleMine();
        field.toggleMark();
        field.open();

        field.restartField();

        Assertions.assertTrue(!field.isOpen() && !field.isMarked() && !field.isMine());

    }
}
