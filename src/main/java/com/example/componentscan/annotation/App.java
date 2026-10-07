package com.example.componentscan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee=context.getBean("robins_employee",Employee.class); // If you dont want to do casting
        System.out.println(employee.toString());
    
 }
}
