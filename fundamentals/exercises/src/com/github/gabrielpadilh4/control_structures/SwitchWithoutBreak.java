package com.github.gabrielpadilh4.control_structures;

import java.util.Locale;

public class SwitchWithoutBreak {

    public static void main(String[] args) {

        String belt = "purple";

        switch (belt.toLowerCase()) {

            case "black":
                System.out.println("Bassai-dai");
            case "brown":
                System.out.println("Tekki Shodan");
            case "purple":
                System.out.println("Heian Godan");
            case "green":
                System.out.println("Heian Yodan");
            case "orange":
                System.out.println("Heian Sandan");
            case "red":
                System.out.println("Heian Nidan");
            case "yellow":
                System.out.println("Heian Shodan");
            // default:
            // System.out.println("I don't know :(");
        }
    }
}
