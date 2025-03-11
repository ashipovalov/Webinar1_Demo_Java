package ru.practicum;

public class Aircraft {
    int capacity;

    String name;

    boolean active;

    Engine engine;

    String serialNumber;

    public Aircraft(){
        System.out.println("Это самый - самый простой конструктор");
    }

    public Aircraft(int capacity){
        this.capacity = capacity;
    }

    public Aircraft(int capacity, boolean active){
        this.capacity = capacity;
        this.active = active;
    }


    void takeOff(){
        System.out.println("Я сажусь!!!!");
    }


    void landing(){
        System.out.println("Я приземлился!!!!!");
    }

}
