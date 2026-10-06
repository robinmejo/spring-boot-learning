package com.example.autowire.name;

public class Car {
    private Specification specification;
 
    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
    }

    public void setSpecification2(Specification specification) {
        this.specification = specification;
    }
    

}
