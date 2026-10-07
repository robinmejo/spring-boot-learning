package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("robins_employee") // If you don't specify a bean name, Spring uses the class name with the first letter converted to lowercase as the default bean name
public class Employee {
    @Value("1192376") 
    private int employeeId;

    @Value("Robin") 
    private String firtsName;

    @Value("${java.home}") 
    private String lastName;

    @Value("#{4*4}") 
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirtsName() {
        return firtsName;
    }
    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firtsName=" + firtsName + ", lastName=" + lastName
                + ", salary=" + salary + "]";
    }

    

    
}
