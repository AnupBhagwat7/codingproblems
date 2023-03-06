package com.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Emp implements Cloneable{

    int id;
    String name;

    List<Address> addressArraList;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Emp(int id, String name, List<Address> addressArraList) {
        this.id = id;
        this.name = name;
        this.addressArraList = addressArraList;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressArraList=" + addressArraList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(name, emp.name) && Objects.equals(addressArraList, emp.addressArraList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, addressArraList);
    }
}

class Address{

    String city;
    int street;

    public Address(String city, int street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street=" + street +
                '}';
    }
}

public class ShallowCopy {

    public static void main(String[] args) {

        Emp e1 = new Emp(1, "Anup", new ArrayList<>(Arrays.asList(new Address("Pune", 10))));

        try {
            Emp e2 = (Emp)e1.clone();
            System.out.println(e1 ==e2);

            e2.addressArraList.add(new Address("Baramati", 23));
            e2.name = "Akshay";

            System.out.println(e1);
            System.out.println(e2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
