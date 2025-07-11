// Engine.java
package com.example;
import javax.inject.Singleton;
import javax.inject.Inject;
//@Singleton
public class Engine {
    private Core c1;
    private Core c2;

    @Inject
    Engine(Core c1, Core c2) {
        this.c1 = c1;
        this.c2 = c2;
        System.out.println("Engine created."+ this);
    }
}