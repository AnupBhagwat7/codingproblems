package com.java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given car sales per country and model,
 * find the top three countries by sales  per model
 * <p>
 * Below is the sample expected output for corolla.
 * <p>
 * "Mexico", "corolla",600
 * "USA", "corolla",250
 * "India", "corolla",200
 * <p>
 * similarly  for all other models.
 */
public class CarSalesDemo {

    public static void main(String[] args) {
        List<CarSales> carSales = new ArrayList<>();
        carSales.add(new CarSales("India", "camry", 50));
        carSales.add(new CarSales("India", "corolla", 200));
        carSales.add(new CarSales("India", "yaris", 300));
        carSales.add(new CarSales("USA", "camry", 400));
        carSales.add(new CarSales("USA", "corolla", 250));
        carSales.add(new CarSales("USA", "yaris", 100));
        carSales.add(new CarSales("USA", "specialedition", 10));
        carSales.add(new CarSales("Mexico", "camry", 90));
        carSales.add(new CarSales("Mexico", "corolla", 600));
        carSales.add(new CarSales("Mexico", "yaris", 102));
        carSales.add(new CarSales("Brazil", "camry", 90));
        carSales.add(new CarSales("Brazil", "corolla", 50));
        carSales.add(new CarSales("Brazil", "yaris", 102));

        System.out.println(carSales.stream().sorted(Comparator.comparing(CarSales::getVolume).reversed()).
                collect(Collectors.groupingBy(CarSales::getModel)));

        carSales.stream().filter(car -> car.volume > 30).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(carSales.stream().anyMatch(carSales1 -> carSales1.volume > 1000));

        System.out.println(carSales.stream().map(carSales1 -> carSales1.model.toUpperCase()).collect(Collectors.toList()));
    }


}

class CarSales {

    public String country;
    public String model;
    public long volume;

    public CarSales(String country, String model, long volume) {
        this.country = country;
        this.model = model;
        this.volume = volume;
    }

    public String getCountry() {
        return country;
    }

    public String getModel() {
        return model;
    }

    public long getVolume() {
        return volume;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "CarSales{" +
                "country='" + country + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }
}
