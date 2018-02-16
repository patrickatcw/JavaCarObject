package com.patrickjones;

public class Car {              //class Car

    private int doors;              //fields
    private int wheels;
    private int year;
    private String model;
    private String engine;
    private String color;
    private String transmission;


   //public Car() {           //constructor, or default constructor, existing without me putting it there

   // }

    public Car(int doors, int wheels, int year, String model, String engine, String color, String transmission) {
        this.doors = doors;
        this.wheels = wheels;
        this.year = year;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.transmission = transmission;
    }

    public void carInfo(String model, String color, int year, String engine, int doors, String transmission) {      //carInfo method
       /* String validModel = model.toLowerCase();
        if(validModel.equals("charger") || validModel.equals("cobalt") ||validModel.equals("focus") ){
        }else{
            this.model = "Unknown";
        }*/
        this.model = model;     //this. refers to fields and (updating model, = model is parameter), assigning
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
