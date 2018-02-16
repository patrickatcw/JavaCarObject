package com.patrickjones;

public class Main {                         //class Main

    public static void main(String[] args) {        //main method

        Car dodge = new Car();
        Car chevy = new Car();
        Car ford = new Car();

        dodge.carInfo("Charger", "red", 1968, "powerful", 2);
        chevy.carInfo("Cobalt", "blue", 1998, "small", 2);
        ford.carInfo("Focus", "white", 2012, "tiny", 4);

        System.out.println("The car model is a " + dodge.getColor()
                + " " + dodge.getYear() + " Dodge " + dodge.getModel()
                + " with a " + dodge.getEngine() + " engine and " + dodge.getDoors() + " doors.");
        System.out.println("The car model is a " + chevy.getColor()
                + " " + chevy.getYear() + " Chevy " + chevy.getModel()
                + " with a " + chevy.getEngine() + " engine and " + chevy.getDoors() + " doors.");
        System.out.println("The car model is a " + ford.getColor()
                + " " + ford.getYear() + " Ford " + ford.getModel()
                + " with a " + ford.getEngine() + " engine and " + ford.getDoors() + " doors.");

    }
}


