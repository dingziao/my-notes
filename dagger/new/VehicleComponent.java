// VehicleComponent.java
package com.example;
import javax.inject.Singleton;
import dagger.Component;
//@Singleton
@Component
interface VehicleComponent {
    Vehicle buildvehicle();
}