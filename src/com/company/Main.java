package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /*
 Main
 static isRaining //30% chance of rain every hour
 createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
 simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
 printRaceResults() // prints each vehicle's name, distance traveled ant type.
     */

    public static ArrayList<Car> cars = new ArrayList<>();

    public static boolean isRaining() {
        Random diceRoll = new Random();
        int result = diceRoll.nextInt(100);

        if (result > 30) {
            return true;

        } else {
            return false;

        }
    }

    public static void createVechicles() {

        for (int i = 0; i <= 10; i++) {
            Random speedLimit = new Random();
            int limit = speedLimit.nextInt(100);
            boolean isLimit = Car.setSpeedLimit(limit);
            cars.add(i, new Car(isLimit));
        }
    }

    public static void main(String[] args) {
        isRaining();
        }


    }
}