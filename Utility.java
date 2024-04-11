
//Write a program to call a method without creating an object of a class.
package encapsulated_constructor_keyword;

public class Utility {
    
    public static void displayMessage() {
        System.out.println("Hello, no object needed to call me!");
    }

    public static void main(String[] args) {
        // Calling the static method without creating an object
        Utility.displayMessage();
    }
}
