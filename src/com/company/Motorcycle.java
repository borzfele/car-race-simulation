package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Motorcycle {

    static int nameNumber;
    int speed;
    String name;
    int distanceTraveled;

    protected Motorcycle(boolean isRaining) {

        if (isRaining) {
            this.speed = 100 - ThreadLocalRandom.current().nextInt(5, 51);
        } else {
            this.speed = 100;
        }

        this.name = "Motorcycle " + nameNumber;
        this.distanceTraveled = 0;
        nameNumber++;
    }

    public void moveForAnHour() {

        this.distanceTraveled = this.distanceTraveled + this.speed;

    }

}
