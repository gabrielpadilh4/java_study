package com.github.gabrielpadilh4.project_standards.observers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Concierge {

    private List<ObserverBirthdayArrival> observers = new ArrayList<>();

    public void registerObserver(ObserverBirthdayArrival observerBirthdayArrival){
        observers.add(observerBirthdayArrival);
    }

    public void monitor(){
        Scanner in = new Scanner(System.in);

        String value = "";

        while(!"exit".equalsIgnoreCase(value)){
            System.out.print("Birthday arrive?");

            value = in.nextLine();

            if("yes".equalsIgnoreCase(value)){

                EventBirthdayArrival event = new EventBirthdayArrival(new Date());

                observers.stream().forEach(o -> o.arrival(event));
            } else {
                System.out.println("False alarm");
            }
        }

        in.close();
    }
}
