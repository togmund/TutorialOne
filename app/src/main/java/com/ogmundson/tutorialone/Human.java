package com.ogmundson.tutorialone;

import java.io.Serializable;

public class Human implements Serializable{

    private double height, weight;
    private String name = "";

    public Human(double height, double weight, String name) {
        this.height = height;
        this.name = name;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
