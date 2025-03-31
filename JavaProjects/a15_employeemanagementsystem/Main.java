package a15_employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        /* Object creation of Person, Employee, Manager, and Executive. */
        Person person = new Person("Alice", 30);
        Employee employee = new Employee("Bob", 35, "Software Engineer");
        Manager manager = new Manager("Charlie", 40, "Project Manager", "IT");
        Executive executive = new Executive("Dave", 45, "Senior Executive", "Finance", "BMW X5");

        /* Call introduce() on each object. */
        person.introduce();
        employee.introduce();
        manager.introduce();
        executive.introduce();
    }
}