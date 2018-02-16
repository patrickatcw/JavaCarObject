package com.patrickjones;

public class Main {                         //class Main

    public static void main(String[] args) {        //main method

        Car dodge = new Car();          //constructors
        Car chevy = new Car();
        Car ford = new Car();
        Car toyota = new Car();

        dodge.carInfo("Charger", "red", 1968, "powerful", 2, "manual");
        chevy.carInfo("Cobalt", "blue", 1998, "small", 2, "automatic");
        ford.carInfo("Focus", "white", 2012, "tiny", 4, "automatic");
        toyota.carInfo("Camry", "silver", 2010, "mid-size", 2, "manual");

        System.out.println("The car is a " + dodge.getColor()   //complete transmission
                + " " + dodge.getYear() + " Dodge " + dodge.getModel()
                + " with a " + dodge.getEngine() + " engine, " + dodge.getDoors()
                + " doors, and a " + dodge.getTransmission() + " transmission.");
        System.out.println("The car is a " + chevy.getColor()
                + " " + chevy.getYear() + " Chevy " + chevy.getModel()
                + " with a " + chevy.getEngine() + " engine and " + chevy.getDoors() + " doors.");
        System.out.println("The car is a " + ford.getColor()
                + " " + ford.getYear() + " Ford " + ford.getModel()
                + " with a " + ford.getEngine() + " engine and " + ford.getDoors() + " doors.");
        System.out.println("The car is a " + toyota.getColor()
                + " " + toyota.getYear() + " Toyota " + toyota.getModel()
                + " with a " + toyota.getEngine() + " engine and " + toyota.getDoors() + " doors.");


    }
}

//object is an instance of a class
//java class types; public, private, protected


