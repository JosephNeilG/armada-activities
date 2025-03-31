package a15_employeemanagementsystem;

/** Manager class extends Employee and adds department field. */
public class Manager extends Employee {
    String department;

    /**
     * Constructor for Manager, initializes name, age, jobTitle, and department.
     * 
     * @param name       The name of the manager.
     * @param age        The age of the manager.
     * @param jobTitle   The job title of the manager.
     * @param department The department the manager oversees.
     */
    Manager(String name, int age, String jobTitle, String department) {
        super(name, age, jobTitle); // Calls employee constructor.
        this.department = department;
    }

    /** Overrides introduce() to display name, age, job title, and department. */
    @Override
    public void introduce() {
        System.out.println("\nIntroducing Manager:");
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Job Title: " + this.jobTitle + ", Department: " + this.department);
    }
}