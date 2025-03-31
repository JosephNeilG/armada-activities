package a15_employeemanagementsystem;

/** Represents a person with a name and age. */
public class Person {
    String name;
    int age;

    /** Constructs a Person with given name and age.
     * 
     * @param name Person's name;
     * @param age  Person's age;
     */
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    /** Introduce person by displaying their name and age. */
    public void introduce() {
        System.out.println("Introducing Person:");
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}