package Inheritance;

class Parent {


    // Parent class method
    void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    // Child class method
    void childMethod() {
        System.out.println("This is child class");
    }
}

public class Parentt {

    public static void main(String[] args) {

        // Object of Parent class
        Parent p = new Parent();

        // Object of Child class
        Child c = new Child();

        // 1. Parent class method by Parent object
        p.parentMethod();

        // 2. Child class method by Child object
        c.childMethod();

        // 3. Parent class method by Child object
        c.parentMethod();
    }
}