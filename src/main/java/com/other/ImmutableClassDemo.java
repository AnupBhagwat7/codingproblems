package com.other;

import java.util.HashMap;
import java.util.Map;

//Mutable class
class Engine{

    private int make;
    private String type;

    public Engine(int make, String type) {
        this.make = make;
        this.type = type;
    }

    public Engine() {

    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "make=" + make +
                ", type='" + type + '\'' +
                '}';
    }
}

//Immutable class
class Car{

    private final String brand;
    private final String color;
    private final int manufacturingYear;

    private Engine engine;

    public Car(String brand, String color, int manufacturingYear, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.manufacturingYear = manufacturingYear;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public Engine getEngine() {
        //return engine;

        Engine clone = new Engine();
        clone.setMake(this.engine.getMake());
        clone.setType(this.engine.getType());
        return clone;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", engine=" + engine +
                '}';
    }
}
public class ImmutableClassDemo {

    public static void main(String[] args) {

        Car c = new Car("Honda", "White", 2016,new Engine(2010,"P"));
        System.out.println(c);
        c.getEngine().setMake(2011);
        System.out.println(c);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(1,"E");

        System.out.println(map);
    }
}
