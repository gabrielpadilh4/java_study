package com.github.gabrielpadilh4.views;

import com.github.gabrielpadilh4.models.Field;
import com.github.gabrielpadilh4.models.FieldEvent;
import com.github.gabrielpadilh4.models.IFieldObserver;

import javax.swing.*;
import javax.swing.text.IconView;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FieldButton extends JButton implements IFieldObserver, MouseListener {

    private final Color BG_DEFAULT = new Color(184, 184, 184);
    private final Color BG_MARK = new Color(8, 179, 247);
    private final Color BG_EXPLODE = new Color(189, 66, 68);
    private final Color TEXT_GREEN = new Color(0, 100, 0);

    private Field field;

    public FieldButton(Field field) {

        this.field = field;

        setBackground(BG_DEFAULT);
        setOpaque(true);

        setBorder(BorderFactory.createBevelBorder(0));

        addMouseListener(this);
        field.registerObserver(this);
    }

    @Override
    public void eventOccur(Field f, FieldEvent event) {

        switch (event) {
            case OPEN:
                applyStyleOpen();
                break;
            case MARK:
                applyStyleMark();
                break;
            case EXPLODE:
                applyStyleExplode();
                break;
            default:
                applyStyleDefault();
        }
    }

    private void applyStyleDefault() {
        setBackground(BG_DEFAULT);
        setText("");
    }

    private void applyStyleExplode() {
        setBackground(BG_EXPLODE);
        setForeground(Color.white);
        setText("X");
    }

    private void applyStyleMark() {
        setBackground(BG_MARK);
        setText("M");
    }

    private void applyStyleOpen() {

        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        if(field.isMine()){
            setBackground(BG_EXPLODE);
            return;
        }

        setBackground(BG_DEFAULT);

        switch (field.neighborsMines()) {
            case 1:
                setForeground(TEXT_GREEN);
                break;
            case 2:
                setForeground(Color.BLUE);
                break;
            case 3:
                setForeground(Color.YELLOW);
                break;
            case 4:
            case 5:
            case 6:
                setForeground(Color.RED);
                break;
            default:
                setForeground(Color.PINK);
        }

        String value = !field.safeNeighborhood() ? field.neighborsMines() + "" : "";
        setText(value);
    }


    // MOUSE EVENTS
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 1) {
           field.open();
        } else {
            field.toggleMark();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
