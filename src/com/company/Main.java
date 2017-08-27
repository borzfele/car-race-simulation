package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static ArrayList<Car> cars = new ArrayList<>();
    public static ArrayList<Motorcycle> motorcycles = new ArrayList<>();
    public static ArrayList<Truck> trucks = new ArrayList<>();


    public static boolean isRaining() {
        Random diceRoll = new Random();
        int result = diceRoll.nextInt(100);

        if (result > 30) {
            return true;
        } else {
            return false;
        }
    }


    public static void createVehicles() {

        for (int i = 0; i < 10; i++) {
            cars.add(i, new Car());
            motorcycles.add(i, new Motorcycle(isRaining()));
            trucks.add(i, new Truck());
        }
    }


    public static void printRaceResults() {

        for (Car car : cars) {
            System.out.println(String.valueOf(car.getClass().getSimpleName()) + ' ' + car.name + ' ' + car.distanceTraveled);
        }
        for (Motorcycle motorcycle : motorcycles) {
            System.out.println(String.valueOf(motorcycle.getClass().getSimpleName()) + ' ' + motorcycle.name + ' ' + motorcycle.distanceTraveled);
        }
        for (Truck truck : trucks) {
            System.out.println(String.valueOf(truck.getClass().getSimpleName()) + ' ' + truck.name + ' ' + truck.distanceTraveled);
        }
    }


    public static void main(String[] args) {

        createVehicles();

        for (int i = 0; i < 50; i++) {
            for (Car car : cars) {
                car.setSpeedLimit(70);
                car.moveForAnHour();
            }
            for (Motorcycle motorcycle : motorcycles) {
                motorcycle.moveForAnHour();
            }
            for (Truck truck : trucks) {
                truck.moveForAnHour();
            }
        }

        printRaceResults();

    }
}