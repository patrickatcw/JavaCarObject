package com.patrickjones;

//object is an instance of a class
//java class types; public, private, protected

public class Main {                         //class Main

    public static void main(String[] args) {        //main method

        //using constructors to build a new instance
        Car dodge = new Car("Charger", "red", 1968, "powerful", 2, "manual");
        Car chevy = new Car("Cobalt", "blue", 1998, "small", 2, "automatic");
        Car ford = new Car("Focus", "white", 2012, "tiny", 4, "automatic");
        Car toyota = new Car("Camry", "silver", 2010, "mid-size", 2, "manual");

        System.out.println("The car is a " + dodge.getColor()
                + " " + dodge.getYear() + " Dodge " + dodge.getModel()
                + " with a " + dodge.getEngine() + " engine, " + dodge.getDoors()
                + " doors, and a " + dodge.getTransmission() + " transmission.");
        System.out.println("The car is a " + chevy.getColor()
                + " " + chevy.getYear() + " Chevy " + chevy.getModel()
                + " with a " + chevy.getEngine() + " engine, " + chevy.getDoors()
                + " doors, and an " + chevy.getTransmission() + " transmission.");
        System.out.println("The car is a " + ford.getColor()
                + " " + ford.getYear() + " Ford " + ford.getModel()
                + " with a " + ford.getEngine() + " engine, " + ford.getDoors()
                + " doors, and an " + ford.getTransmission() + " transmission.");
        System.out.println("The car is a " + toyota.getColor()
                + " " + toyota.getYear() + " Toyota " + toyota.getModel()
                + " with a " + toyota.getEngine() + " engine, " + toyota.getDoors()
                + " doors, and a " + toyota.getTransmission() + " transmission.");

    }
}

/*
printout results;
    The car is a red 1968 Dodge Charger with a powerful engine, 2 doors, and a manual transmission.
    The car is a blue 1998 Chevy Cobalt with a small engine, 2 doors, and an automatic transmission.
    The car is a white 2012 Ford Focus with a tiny engine, 4 doors, and an automatic transmission.
    The car is a silver 2010 Toyota Camry with a mid-size engine, 2 doors, and a manual transmission.
*/




