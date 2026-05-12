package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide= new Moped();
        slowRide.setColor("Red");
        slowRide.setCargoCapacity(2);
        slowRide.setNumberOfPassengers(2);
        slowRide.setFuelCapacity(5);

        Car familyCar= new Car();
        familyCar.setColor("white");
        familyCar.setCargoCapacity(5);
        familyCar.setNumberOfPassengers(5);
        familyCar.setFuelCapacity(13);

        SemiTruck truck=new SemiTruck();
        truck.setCargoCapacity(1000);
        truck.setColor("black");
        truck.setNumberOfPassengers(3);
        truck.setFuelCapacity(20);

        System.out.println(familyCar.getColor());


    }
}
