package com.example.verbose_disco.models;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    private static List<Car> carlist = new ArrayList<>();

    public void save(Car car){
        carlist.add(car);
    }

    public List<Car> getCarList(){
        return carlist;
    }

    public void deleteCar(int p){
        carlist.remove(p);
    }

    public Car getCar(int p){
        return carlist.get(p);
    }

}

