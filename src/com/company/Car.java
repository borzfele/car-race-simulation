package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Car {

    int speed;
    String name;
    int distanceTraveled;

    //constructor
    public Car() {
        ArrayList<String> nameComponents = new ArrayList<>();

        //initialize nameComponents
        nameComponents.add("Hydra");
        nameComponents.add("Virgo");
        nameComponents.add("Ursa");
        nameComponents.add("Cetus");
        nameComponents.add("Hercules");
        nameComponents.add("Eridanus");
        nameComponents.add("Pegasus");
        nameComponents.add("Draco");
        nameComponents.add("Centaurus");
        nameComponents.add("Aquarius");
        nameComponents.add("Ophiuchus");
        nameComponents.add("Leo");
        nameComponents.add("Bootes");
        nameComponents.add("Pisces");
        nameComponents.add("Sagittarius");
        nameComponents.add("Cygnus");
        nameComponents.add("Taurus");
        nameComponents.add("Camelopardalis");
        nameComponents.add("Andromeda");
        nameComponents.add("Puppis");
        nameComponents.add("Auriga");
        nameComponents.add("Aquila");
        nameComponents.add("Serpens");
        nameComponents.add("Perseus");
        nameComponents.add("Cassiopeia");
        nameComponents.add("Orion");
        nameComponents.add("Cepheus");
        nameComponents.add("Lynx");
        nameComponents.add("Libra");
        nameComponents.add("Gemini");
        nameComponents.add("Cancer");
        nameComponents.add("Vela");
        nameComponents.add("Scorpius");
        nameComponents.add("Carina");
        nameComponents.add("Monoceros");
        nameComponents.add("Sculptor");
        nameComponents.add("Phoenix");
        nameComponents.add("Canes Venatici");
        nameComponents.add("Aries");
        nameComponents.add("Capricornus");
        nameComponents.add("Fornax");
        nameComponents.add("Coma Berenices");
        nameComponents.add("Canis Major");
        nameComponents.add("Pavo");
        nameComponents.add("Grus");
        nameComponents.add("Lupus");
        nameComponents.add("Sextans");
        nameComponents.add("Tucana");
        nameComponents.add("Indus");
        nameComponents.add("Octans");
        nameComponents.add("Lepus");
        nameComponents.add("Lyra");
        nameComponents.add("Crater");
        nameComponents.add("Columba");
        nameComponents.add("Vulpecula");
        nameComponents.add("Ursa Minor");
        nameComponents.add("Telescopium");
        nameComponents.add("Horologium");
        nameComponents.add("Pictor");
        nameComponents.add("Piscis Austrinus");
        nameComponents.add("Hydrus");
        nameComponents.add("Antlia");
        nameComponents.add("Ara");
        nameComponents.add("Leo Minor");
        nameComponents.add("Pyxis");
        nameComponents.add("Microscopium");
        nameComponents.add("Apus");
        nameComponents.add("Lacerta");
        nameComponents.add("Delphhinus");
        nameComponents.add("Corvus");
        nameComponents.add("Canis Minor");
        nameComponents.add("Dorado");
        nameComponents.add("Corona Borealis");
        nameComponents.add("Norma");
        nameComponents.add("Mensa");
        nameComponents.add("Volans");
        nameComponents.add("Musca");
        nameComponents.add("Triangulum");
        nameComponents.add("Chamaeleon");
        nameComponents.add("Corona Australis");
        nameComponents.add("Caelum");
        nameComponents.add("Reticulum");
        nameComponents.add("Triangulim Australe");
        nameComponents.add("Scutum");
        nameComponents.add("Circinum");
        nameComponents.add("Sagitta");
        nameComponents.add("Equuleus");
        nameComponents.add("Crux");

        //initialize speed
        Random speedLimit = new Random();
        int limit = speedLimit.nextInt(100);
        boolean isLimit = Car.setSpeedLimit(limit);
        if (isLimit) {
            this.speed = 70;
        } else {
            this.speed = ThreadLocalRandom.current().nextInt(80, 111);
        }

        //initialize name
        this.name = nameComponents.get(ThreadLocalRandom.current().nextInt(0, nameComponents.size() - 1)) + ' ' + nameComponents.get(ThreadLocalRandom.current().nextInt(0, nameComponents.size() - 1));

        //initialize distanceTraveled
        this.distanceTraveled = 0;

    }


    protected static boolean setSpeedLimit(int limit) {
        if (limit > 30) {
            return false;
        } else {
            return true;
        }
    }


    public void moveForAnHour() {

        this.distanceTraveled = this.distanceTraveled + this.speed;

    }

}
