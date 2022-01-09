package co.pragra.learning.springdemo.model;

import co.pragra.learning.springdemo.model.IEngine;

public class Car {
    private String make;
    private String model;
    private IEngine engine;

    public Car(String make, String model, IEngine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car " +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine type=" + engine.getEngine() +
                "engine power " + engine.getEnginePower()+
                '}';
    }
}
