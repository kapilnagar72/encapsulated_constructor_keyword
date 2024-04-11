package encapsulated_constructor_keyword;

public class keyword {
    private String name;
    private int age;

public void Person(String name, int age) {
this.name = name;
this.age = age;
}

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public void callOtherMethod() {
        
        otherMethod(this);
    }

    private void otherMethod(keyword keyword) {
        
    }
}
