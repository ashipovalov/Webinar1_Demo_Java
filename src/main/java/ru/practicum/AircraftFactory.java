package ru.practicum;

public class AircraftFactory {
    Aircraft[] create(int count){
        Aircraft[] aircrafts = new Aircraft[count];
        for(int i = 0; i < count; i++){
           aircrafts[i] = new Aircraft(i+10);
        }
        return aircrafts;

    }
}
