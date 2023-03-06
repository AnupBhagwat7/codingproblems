package com.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Empl implements Cloneable{

    int id;
    String name;

    List<Address1> addressArraList = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Empl emp = (Empl) super.clone();
        emp.id = this.id;
        emp.name = this.name;
        emp.addressArraList = new ArrayList<>();
        emp.addressArraList.addAll(this.addressArraList);
        return emp;
    }

    public Empl(int id, String name, List<Address1> addressArraList) {
        this.id = id;
        this.name = name;
        this.addressArraList = addressArraList;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressArraList=" + addressArraList +
                '}';
    }
}

class Address1{

    String city;
    int street;

    public Address1(String city, int street) {
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

public class DeepCopy {

    public static void main(String[] args) {

        Empl e1 = new Empl(1, "Anup", new ArrayList<>(Arrays.asList(new Address1("Pune", 10))));

        try {
            Empl e2 = (Empl)e1.clone();
            System.out.println(e1 == e2);

            e2.addressArraList.add(new Address1("Baramati", 23));

            System.out.println(e1);
            System.out.println(e2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
