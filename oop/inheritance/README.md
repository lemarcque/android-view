# Inheritance
## Description
Inheritance is mechanism that enable, at the declaration of a new class, to include the characteristic of another class (called a superclass - also parent class or base class). The class that inherit for the attributes of the superclass is called the subclass or children class, derived class). 

By declaring a new Class B by inheritance of the class A, we can say that:
- A is a generalization of B and B is a specialization of A;
- A is a superclass of B and B is a subclass of A;
- A is a mother class of B and B is a child class of A;

## UML Scheme
<center>
<img src="https://raw.githubusercontent.com/lemarcque/software-skills/master/oop/inheritance/res/uml-inheritance.png" alt="alt text" width="200"></center>
## Implementation

Code of the superclass : `A.java`
```java
/**
 * @author lemarcque
 */

/**
 * The subclass class of the superclass A
 */
public class B extends A {

}
```
Code of the subclass : `B.java`
```java
/**
 * @author lemarcque
 */

/**
 * The subclass class of the superclass A
 */
public class B extends A {

}
```

Code of to test
```java
/**
 * @author Henoc Sese (lemarcque)
 */

/**
 * Starting class of the program
 */
public class InheritanceExample {

    public static void main(String[] args) {
        // Instantiation of an object from class A
        A a = new A();

        // Instantiation of an object from class A
        A b = new B();

        System.out.println("Name : " + a.name); // show : " Name : A"
        System.out.println("Name : " + b.name); // show : " Name : A"
    }
}
```


Output :
```sh
Name : A
Name : A
```



