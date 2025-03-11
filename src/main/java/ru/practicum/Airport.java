package ru.practicum;

public class Airport {

    Aircraft[] aircrafts;

    public static void main(String[] args) {
        AircraftFactory aircraftFactory = new AircraftFactory();
       Aircraft[] aircrafts =  aircraftFactory.create(20);
        System.out.println(aircrafts[15].capacity);
        Aircraft myAir = aircrafts[1];
        myAir.landing();





    }
}
