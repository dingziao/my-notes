// Main.java
package com.example;

public class Main {
    public static void main(String[] args) {
        VehicleComponent component = DaggerVehicleComponent.create();
        Vehicle vehicle = component.buildvehicle();
    }
}
