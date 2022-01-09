package co.pragra.learning.springdemo.model;

import co.pragra.learning.springdemo.model.IEngine;

public class ElectricEngine implements IEngine {
    private String type;
    private double hp;

    public ElectricEngine(String type, double hp) {
        this.type = type;
        this.hp = hp;
    }

    @Override
    public String getEngine() {
        return type;
    }

    @Override
    public double getEnginePower() {
        return hp;
    }
}
