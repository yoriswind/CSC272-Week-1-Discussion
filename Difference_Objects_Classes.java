// This is a class. Think of it as a blueprint for what a "Car" should be like.
public class Car {
    // These are instance variables of the class.
    String color;
    String model;

    // This is a method that a car can do.
    void drive() {
        System.out.println("The " + color + " " + model + " is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object from the Car class.
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        
        // Creating another object from the Car class.
        Car yourCar = new Car();
        yourCar.color = "Blue";
        yourCar.model = "Honda";

        // Each object has its own data, even though they share the same class.
        myCar.drive();   // Output: The Red Toyota is driving.
        yourCar.drive(); // Output: The Blue Honda is driving.

        // Summary:
        // Car.java defines the class.
        // myCar and yourCar are objects.
    }
}