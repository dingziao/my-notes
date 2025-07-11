// Core.java
package com.example;

import javax.inject.Inject;
import javax.inject.Singleton;

//@Singleton
public class Core {
    private String id;
    @Inject
    Core() {
        System.out.println("Core: " + this);
    }
}