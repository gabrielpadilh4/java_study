package com.github.gabrielpadilh4.models;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private enum CommandType {
        RESET, NUMBER, DIVISION, MULTIPLICATION, SUBTRACTION, SUM, EQUAL, COMMA, SPLIT_REST;
    }

    private static final Memory memoryInstance = new Memory();

    private final List<IMemoryObserver> observers = new ArrayList<>();

    private String actualText = "";
    private String bufferText = "";
    private CommandType lastOperation = null;
    private boolean toggle = false;

    private Memory() {

    }

    public static Memory getInstance() {
        return memoryInstance;
    }

    public void addObserver(IMemoryObserver observer) {
        observers.add(observer);
    }

    public String getActualText() {
        return actualText.isEmpty() ? "0" : actualText;
    }

    public void processCommand(String text) {

        CommandType commandType = detectCommandType(text);

        if (commandType == null) {
            return;
        } else if (commandType == CommandType.RESET) {
            actualText = "";
            bufferText = "";
            toggle = false;
        } else if (commandType == CommandType.NUMBER || commandType == CommandType.COMMA) {
            actualText = toggle ? text : actualText + text;
            toggle = false;
        } else {

            toggle = true;
            actualText = getOperationResult();
            bufferText = actualText;
            lastOperation = commandType;

        }


        observers.forEach(o -> o.updatedValue(getActualText()));
    }

    public String getOperationResult() {

        if (lastOperation == null || lastOperation == CommandType.EQUAL) {
            return actualText;
        }

        double numberBuffer = Double.parseDouble(bufferText.replace(",", "."));
        double actualBuffer = Double.parseDouble(actualText.replace(",", "."));

        double result = 0;

        if (lastOperation == CommandType.SUM) {
            result = numberBuffer + actualBuffer;
        }

        if (lastOperation == CommandType.SUBTRACTION) {
            result = numberBuffer - actualBuffer;
        }

        if (lastOperation == CommandType.DIVISION) {
            result = numberBuffer / actualBuffer;
        }

        if (lastOperation == CommandType.MULTIPLICATION) {
            result = numberBuffer * actualBuffer;
        }

        if (lastOperation == CommandType.SPLIT_REST) {
            result = numberBuffer % actualBuffer;
        }

        String stringResult = Double.toString(result).replace(".", ",");

        boolean integer = stringResult.endsWith(",0");

        return integer ? stringResult.replace(",0", "") : stringResult;
    }

    private CommandType detectCommandType(String text) {
        if (actualText.isEmpty() && text == "0") {
            return null;
        }

        try {
            Integer.parseInt(text);
            return CommandType.NUMBER;
        } catch (NumberFormatException e) {

            if (text.equalsIgnoreCase("AC")) {
                return CommandType.RESET;
            }

            if (text.equalsIgnoreCase("/")) {
                return CommandType.DIVISION;
            }

            if (text.equalsIgnoreCase("*")) {
                return CommandType.MULTIPLICATION;
            }

            if (text.equalsIgnoreCase("+")) {
                return CommandType.SUM;
            }

            if (text.equalsIgnoreCase("-")) {
                return CommandType.SUBTRACTION;
            }

            if (text.equalsIgnoreCase("=")) {
                return CommandType.EQUAL;
            }

            if (text.equalsIgnoreCase("%")) {
                return CommandType.SPLIT_REST;
            }

            if (text.equalsIgnoreCase(",") && !actualText.contains(",")) {
                return CommandType.COMMA;
            }

        }

        return null;

    }
}
