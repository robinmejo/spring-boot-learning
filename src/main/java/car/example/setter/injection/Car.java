package car.example.setter.injection;

public class Car {
    private Specification specification;
 
    // public Car(Specification specification) {
    //     this.specification = specification;
    // }

    //Here we are using setter injection not constructor injection 


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
    
    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
    }

}
