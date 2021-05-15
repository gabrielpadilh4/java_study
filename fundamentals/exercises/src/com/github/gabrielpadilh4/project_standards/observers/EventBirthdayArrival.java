package com.github.gabrielpadilh4.project_standards.observers;

import java.util.Date;

public class EventBirthdayArrival {

    private final Date moment;

    public EventBirthdayArrival(Date moment) {
        this.moment = moment;
    }

    public Date getMoment() {
        return moment;
    }
}
