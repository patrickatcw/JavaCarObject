package com.patrickjones;

public class Main {

    public static void main(String[] args) {

        Car dodge = new Car();
        Car chevy = new Car();
        Car ford = new Car();

        dodge.carInfo("Charger", "red", 1968, "powerful");
        chevy.carInfo("Cobalt", "blue", 1998, "small");
        ford.carInfo("Focus", "white", 2012, "tiny");

        System.out.println("The car model is a " + dodge.getColor()
                + " " + dodge.getYear() + " Dodge " + dodge.getModel() + " with a " + dodge.getEngine() + " engine. ");
        System.out.println("The car model is a " + chevy.getColor()
                + " " + chevy.getYear() + " Chevy " + chevy.getModel()+ " with a " + chevy.getEngine() + " engine. ");
        System.out.println("The car model is a " + ford.getColor()
                + " " + ford.getYear() + " Ford " + ford.getModel()+ " with a " + ford.getEngine() + " engine. ");

    }
}


