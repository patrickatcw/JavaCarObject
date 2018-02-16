package com.patrickjones;

public class Car {

    private int doors;
    private int wheels;
    private int year;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model, String color) {
       /* String validModel = model.toLowerCase();
        if(validModel.equals("charger") || validModel.equals("cobalt") ||validModel.equals("focus") ){
        }else{
            this.model = "Unknown";
        }*/
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

}
