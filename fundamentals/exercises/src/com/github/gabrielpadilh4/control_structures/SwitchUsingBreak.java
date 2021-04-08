package com.github.gabrielpadilh4.control_structures;

public class SwitchUsingBreak {

    public static void main(String[] args) {
        String concept = "";
        int number = 7;

        switch (number) {
            case 10:  case 9:
                concept = "A";
                break; // exit switch
            case 8: case 7:
                concept = "B";
                break;
            default:
                concept = "not found";
        }

        System.out.println(concept);
    }
}
