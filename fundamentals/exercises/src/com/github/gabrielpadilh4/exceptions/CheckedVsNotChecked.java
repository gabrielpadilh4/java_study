package com.github.gabrielpadilh4.exceptions;

public class CheckedVsNotChecked {

    public static void main(String[] args) {
        generateError1();
        generateError2();
    }

    // Not checked
    static void generateError1() {
        throw new RuntimeException("Cool error #1");
    }

    // Checked
    static void generateError2() throws Exception {
        throw new Exception("Cool err2 #1");
    }
}
