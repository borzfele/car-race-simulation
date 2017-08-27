package com.company;


import java.util.Random;


public class Truck {

    int speed;
    String name;
    int distanceTraveled;
    int breakDownTurnsLeft;


    protected Truck() {

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
