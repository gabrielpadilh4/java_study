package com.github.gabrielpadilh4.project_standards.observers;

public class BirthdayParty {

    public static void main(String[] args) {

        Girlfriend girlfriend = new Girlfriend();
        Concierge concierge = new Concierge();

        concierge.registerObserver(girlfriend);

        concierge.monitor();
    }
}
