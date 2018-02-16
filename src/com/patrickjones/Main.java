package com.patrickjones;

public class Main {

    public static void main(String[] args) {

        Car dodge = new Car();
        Car chevy = new Car();
        Car ford = new Car();

        dodge.setModel("Charger", "red");
        chevy.setModel("Cobalt", "blue");
        ford.setModel("Focus", "white");

        System.out.println("Car model is a " + dodge.getColor() + " Dodge " + dodge.getModel());
        System.out.println("Car model is a " + chevy.getColor() + " Chevy " + chevy.getModel());
        System.out.println("Car model is a " + ford.getColor() + " Ford " + ford.getModel());

    }
}


