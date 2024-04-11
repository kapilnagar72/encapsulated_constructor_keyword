
//Write a program and create a constructor with parameters and initialise the variable using a constructor.
package encapsulated_constructor_keyword;


public class person {
    private static final String Name = null;
    private static int age;

    public person(String name, int age) {
        person.age = age;
    }

    public static void displayInfo() {
        //String name;
        System.out.println("Name: " + Name + ", Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        
        encapsulated_constructor_keyword.person.displayInfo();
    }
}




