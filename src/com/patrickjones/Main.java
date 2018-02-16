package com.patrickjones;

public class Main {                         //class Main

    public static void main(String[] args) {        //main method

        Car dodge = new Car();          //constructors
        Car chevy = new Car();
        Car ford = new Car();
        Car toyota = new Car();

        dodge.carInfo("Charger", "red", 1968, "powerful", 2);
        chevy.carInfo("Cobalt", "blue", 1998, "small", 2);
        ford.carInfo("Focus", "white", 2012, "tiny", 4);
        toyota.carInfo("Camry", "silver", 2010, "mid-size", 2);

        System.out.println("The car is a " + dodge.getColor()
                + " " + dodge.getYear() + " Dodge " + dodge.getModel()
                + " with a " + dodge.getEngine() + " engine and " + dodge.getDoors() + " doors.");
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


