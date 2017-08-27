package com.company;


import java.util.concurrent.ThreadLocalRandom;


public class Motorcycle {

    static int nameNumber;
    int speed;
    String name;
    int distanceTraveled;


    protected Motorcycle(boolean isRaining) {

        if (isRaining) {
            speed = 100 - ThreadLocalRandom.current().nextInt(5, 51);
        } else {
            speed = 100;
        }

        name = "Motorcycle " + nameNumber;
        distanceTraveled = 0;
        nameNumber++;
    }


    public void moveForAnHour() {

        distanceTraveled = distanceTraveled + speed;
    }
}
