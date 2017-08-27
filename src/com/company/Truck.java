package com.company;

import java.util.Random;

public class Truck {

    /*
    Truck // speed: 100km/h. 5% chance of breaking down for 2 hours.
 // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
 breakdownTurnsLeft // holds how long its still broken down.
 distanceTraveled
 moveForAnHour()
     */

    int speed;
    String name;
    int distanceTraveled;
    int breakDownTurnsLeft;

    public Truck() {
        speed = 100;
        Random newRand = new Random();
        name = String.valueOf(newRand.nextInt(1001));
        breakDownTurnsLeft = 0;
    }

    protected void moveForAnHour() {
        Random breakRoll = new Random();
        int breakDownChance = breakRoll.nextInt(101);

        if (breakDownTurnsLeft == 0 && breakDownChance > 5) {
            distanceTraveled = distanceTraveled + speed;
        } else if (breakDownTurnsLeft == 0 && breakDownChance <= 5) {
            breakDownTurnsLeft = 2;
        } else if (breakDownTurnsLeft != 0) {
            breakDownTurnsLeft--;
        }
    }

}
