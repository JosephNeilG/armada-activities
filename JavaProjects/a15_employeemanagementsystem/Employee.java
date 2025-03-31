package a15_employeemanagementsystem;

/** Employee class extends Person and adds a job title field. */
public class Employee extends Person {
    String jobTitle;

    /**
     * Constructs for Employee, initializes name, age, and job title. 
     * 
     * @param name     Employee's name.
     * @param age      Employee's age.
     * @param jobTitle Employee's job title.
    */
    Employee(String name, int age, String jobTitle) {
        super(name, age); // Calls Person constructor.
        this.jobTitle = jobTitle;
    }

    /** Overrides introduce() to display name, age, and job title. */
    @Override
    public void introduce() {
        System.out.println("\nIntroducing Employee:");
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Job Title: " + this.jobTitle);
    }
}