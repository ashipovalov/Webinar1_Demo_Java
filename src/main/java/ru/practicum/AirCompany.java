package ru.practicum;

public class AirCompany {
    AircraftFactory aircraftFactory;

    Aircraft[] contract(){
        aircraftFactory = new AircraftFactory();
        Aircraft[] aircrafts = aircraftFactory.create(100);
        return aircrafts;
    }
}
