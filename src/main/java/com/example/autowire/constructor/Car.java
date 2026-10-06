package com.example.autowire.constructor;

public class Car {
    private Specification specification;

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }

    public Car(Specification specification) {
        this.specification = specification;
    }

    

}
