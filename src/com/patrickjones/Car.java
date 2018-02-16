package com.patrickjones;

//object is an instance of a class
//java class types; public, private, protected

public class Car {              //class Car

    private String model;       //fields
    private String color;
    private int year;
    private String engine;
    private int doors;
    private String transmission;

    //public Car() {           constructor, or default constructor, existing without me putting it there,
       // }                    but....i made my own below with this. for references to fields above

    //made my own constructor (method) with parameters and references to fields above.
    public Car(String model, String color, int year, String engine, int doors, String transmission) {

        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.doors = doors;
        this.transmission = transmission;

    }

    public String getModel() {          //these are methods
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String getEngine(){
        return this.engine;
    }

    public int getDoors() {
        return this.doors;
    }

    public String getTransmission(){
        return this.transmission;
    }

}
