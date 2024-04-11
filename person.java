
//Write a program and create a constructor with parameters and initialise the variable using a constructor.
package encapsulated_constructor_keyword;


public class person {
    // Instance variables
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        
        person person = new person("Alice", 30);

        person.displayInfo();
    }
}




