package co.pragra.learning.springdemo.model;

import co.pragra.learning.springdemo.model.IEngine;

public class GasolineEngine implements IEngine {
    private String type;
    private double cc;

    public GasolineEngine(String type, double cc) {
        this.type = type;
        this.cc = cc;
    }

    @Override
    public String getEngine() {
        return type;
    }

    @Override
    public double getEnginePower() {
        return cc;
    }
}
