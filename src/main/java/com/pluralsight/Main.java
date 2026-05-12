package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped("Red", 2, 2, 5);

        Car familyCar = new Car("White", 5, 5, 13);

        SemiTruck truck = new SemiTruck("Black", 3, 1000, 20);

        Hovercraft hover = new Hovercraft("Blue", 4, 10, 15);

        System.out.println(slowRide.getColor());
        System.out.println(familyCar.getFuelCapacity());
    }
}