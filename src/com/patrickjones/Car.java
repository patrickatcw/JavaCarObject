package com.patrickjones;

public class Car {              //class Car

    private int doors;              //fields
    private int wheels;
    private int year;
    private String model;
    private String engine;
    private String color;

    public void carInfo(String model, String color, int year, String engine, int doors) {      //carInfo method
       /* String validModel = model.toLowerCase();
        if(validModel.equals("charger") || validModel.equals("cobalt") ||validModel.equals("focus") ){
        }else{
            this.model = "Unknown";
        }*/
        this.model = model;     //this. refers to fields and (updating model, = model is parameter)
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.doors = doors;
    }

    public String getModel() {
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

}
