package com.github.gabrielpadilh4.project_standards.observers;

public class Girlfriend implements ObserverBirthdayArrival {

    @Override
    public void arrival(EventBirthdayArrival eventBirthdayArrival) {
        System.out.println("Tell the guests");
        System.out.println("Turn off the lights");
        System.out.println("Wait a moment");
        System.out.println("Happy Birthday to you...");
    }
}
