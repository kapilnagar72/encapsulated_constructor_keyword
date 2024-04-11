package encapsulated_constructor_keyword;

public class person1 {

    private String name;
    private int age;

    public person1(String name, int age) {
        setName(name); 
        setAge(age);
    }

    // Getter for the name
    public String getName() {
        return name;
    }
   // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the age
    public int getAge() {
        return age;
    }

    // Setter for the age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative. Setting age to 0.");
            this.age = 0;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }

    public static void main(String[] args) {
        person1 person = new person1("Alice", 30);
        person.displayInfo();
        person.setName("Bob");
        person.setAge(25);
        person.displayInfo();
    }
}










































