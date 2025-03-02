package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Sorting {

    public static void main(String[] args) {

        List<VehicleLine> vehileLines = new ArrayList<>();

        vehileLines.add(new VehicleLine("1234", "toyota", "camry", "lx", "2020"));

        vehileLines.add(new VehicleLine("abcd", "toyota", "camry", "lx", "2020"));

        vehileLines.add(new VehicleLine("456", "Honda", "camry", "lx", "2020"));

        vehileLines.add(new VehicleLine("321", "Hyundai", "camry", "lx", "2020"));

        Map<String, List<VehicleLine>> map = vehileLines.stream().
                sorted(Comparator.comparing(VehicleLine::getMake).reversed().
                        thenComparing(VehicleLine::getVin)).collect(Collectors.groupingBy(VehicleLine::getMake));
        System.out.println(map);

        System.out.println(vehileLines.stream().sorted(Comparator.comparing(VehicleLine::getVin)).collect(Collectors.toList()));
    }
}


class VehicleLine {

    private String vin;
    private String make;
    private String model;
    private String trim;
    private String year;

    VehicleLine(String vin, String make, String model, String trim, String year) {

        this.vin = vin;

        this.make = make;

        this.model = model;

        this.trim = trim;

        this.year = year;

    }

    public String getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return make + " " + vin;
    }

}