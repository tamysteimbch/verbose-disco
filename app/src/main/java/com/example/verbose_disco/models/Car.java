package com.example.verbose_disco.models;

public class Car {
    private String carName;
    private String carBrand;
    private int manufactured;
    private String carColor;
    private float engine;
    private String carFuel;
    private String carValue;

    public Car(String carName, String carBrand, String carColor, String carFuel,
               int manufactured, float engine,  String carValue) {
        this.carName = carName;
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carFuel = carFuel;
        this.manufactured = manufactured;
        this.engine = engine;
        this.carValue = carValue;
    }

    public String getCarName() {return carName;}

    public void setCarName(String carName) {this.carName = carName;}

    public String getCarBrand() {return carBrand;}

    public void setCarBrand(String carBrand) {this.carBrand = carBrand;}

    public int getManufactured() {return manufactured;}

    public void setManufactured(int manufactured) {this.manufactured = manufactured;}

    public String getCarColor() {return carColor;}

    public void setCarColor(String carColor) {this.carColor = carColor;}

    public float getEngine() {return engine;}

    public void setEngine(float engine) {this.engine = engine;}

    public String getCarFuel() {return carFuel;}

    public void setCarFuel(String carFuel) {this.carFuel = carFuel;}

    public String getCarValue() {return carValue;}

    public void setCarValue(String carValue) {this.carValue = carValue;}

    @Override
    public String toString() { return this.carName; }
}

