# encapsulated_constructor_keyword

# encapsulated_constructor_keyword

          **  encapsulated_constructor_keyword  **


                 ** keyword  **

1. Why do we need static keyword in Java Programming?
Ans : In Java, static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes.
 It is a keyword which is used to share the same variable or method of a given class. Basically, static is used for a constant variable
 or a method that is same for every instance of a class.

2. What is class loading and how does the Java program actually executes?
 Ans : The Java Class Loader, part of the Java Runtime Environment, dynamically loads Java classes into the Java Virtual Machine.
 Usually classes are only loaded on demand. The virtual machine will only load the class files required for executing the program.

3 Can we mark a local variable as static?
 Ans : Yes, local variables can be declared as static in Java, but only in a limited context.
You can't declare a static variable within ANY method.

4. Why is a static method also called a class method?
 Ans :  A static method can be called directly from the class, without having to create an instance of the class.
 A static method can only access static variables; it cannot access instance variables. Since the static method refers to the class,
 the syntax to call or refer to a static method is: class name. method name.

5. Why is the static block executed before the main method in java?
 Ans : Static block code executes only once during the class loading.
 The static blocks always execute first before the main() method in Java because the compiler stores them in memory at the time of class loading and before the object creation.

6. What is the use of static keyword Explain with an example
 Ans :  In Java, static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes.
 It is a keyword which is used to share the same variable or method of a given class. Basically, static is used for a constant variable or
 a method that is same for every instance of a class.

7. The difference between a static variable and instance variable is as follows:
 Ans :  Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.
 Static variables are created when the program starts and destroyed when the program stops.
 Instance variables can be accessed directly by calling the variable name inside the class.

8. Difference between static and non static members of a class
 Ans :  Static: Static members are initialized when the class is loaded into memory, typically during program startup. Initialization happens only once.
        Non-Static: Non-static members are initialized when each instance of the class is created, usually using the new keyword.
       Initialization occurs separately for each object.


                 **  constructor  **

1. What is a Constructor?
 Ans :  In class-based, object-oriented programming, a constructor is a special type of function called to create an object.
 It prepares the new object for use, often accepting arguments that the constructor uses to set required member variables.

2. What is Constructor Chaining?
 Ans : Constructor chaining is a technique in C# that allows one constructor to call another constructor of the same class or a base class.
      It can help simplify the initialization of objects and avoid code duplication.

3. Can we call a subclass constructor from a superclass constructor?
 Ans :  No. We cannot call a subclass constructor from a superclass constructor.

4. What happens if you keep a return type for a constructor? 
 Ans : Since constructor can only return the object to class, it's implicitly done by java runtime and we are not supposed to add a return type to it.
 If we add a return type to a constructor, then it will become a method of the class.
 This is the way java runtime distinguish between a normal method and a constructor.

5. What is No-arg constructor?
 Ans : No-Arg Constructor - a constructor that does not accept any arguments. Parameterized constructor - a constructor that accepts arguments.
 Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.

6. How is a No-argument constructor different from the default Constructor?
 Ans :  Let's differentiate between a default constructor and a no-argument constructor.
The main difference between the two is that a default constructor will initialize fields to their default values.
In contrast, a no-argument constructor will not initialize any fields.

7. When do we need Constructor Overloading?
 Ans : If we want to have different ways of initializing an object using a different number of parameters,
then we must do constructor overloading as we do method overloading when we want different definitions of a method based on different parameters.

8. What is Default Constructor ?
 Ans : In computer programming languages, the term default constructor can refer to a constructor that is automatically generated by
 the compiler in the absence of any programmer-defined constructors, and is usually a nullary constructor. 


           **   Encapsulation  **

1. What is Encapsulation in Java? Why is it called Data hiding?
 Ans :  Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit. In encapsulation,
 a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.

2. What are the important features of Encapsulation?
 Ans :  Encapsulation is important because it provides a powerful way to store, hide, and manipulate data while giving you increased control over it.
 Encapsulation can used when dealing with secure data or methods because it can restrict which functions or users have access to certain information.

3. What is the advantage of Encapsulation?
 Ans :  Advantages of Encapsulation
We can change the code read-only or write-only by getter and setter methods. This also helps in debugging the code if needed.
 Reusability: The methods can be changed and the code is reusable.
