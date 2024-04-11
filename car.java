
//Write a program which has static block and constructor overloading,initialise variables using constructors and print it.
package encapsulated_constructor_keyword;
   
public class car {
    // Instance variables
    private String make;
    private String model;
    private int year;

    // Static block
    static {
        System.out.println("Car class is loaded and static block is called.");
    }

    // Constructor to initialize make and model
    public car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = -1;  // Default year if not specified
        displayInfo();
    }

    // Constructor to initialize make, model, and year
    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        displayInfo();
    }

    // Method to display the car's information
    public void displayInfo() {
        if (year != -1) {
            System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        } else {
            System.out.println("Make: " + make + ", Model: " + model);
        }
    }

    public static void main(String[] args) {
        // Creating Car objects with different constructors
        new car("Toyota", "Corolla");
        new car("Honda", "Civic", 2020);
    }
}
