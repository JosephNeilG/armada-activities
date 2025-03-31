package a14_understandinginheritance;

/** Superclass Person with attributes name, age, and displayInfo() method. */
public class Person {
    String name;
    int age;

    /**
     * Constructs a new Person object with specified name and age.
     * 
     * @param name The person's name.
     * @param age The person's age. 
     */
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Displays the person's name and age. */
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}