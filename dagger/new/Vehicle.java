// Vehicle.java
package com.example;

import javax.inject.Inject;
public class Vehicle {
    private Engine e1;
    private Engine e2;

    @Inject
    Vehicle(Engine e1, Engine e2) {
        this.e1 = e1;
        this.e2 = e2;
        System.out.println("Vehicle Created by injection.");
    }
}