package a15_employeemanagementsystem;

/** Executive class extends Manager and adds a company car field. */
public class Executive extends Manager {
    String companyCar;

    /**
     * Constructor for Executive, initializes name, age, jobTitle, department, and companyCar.
     * 
     * @param name       Executive's name.
     * @param age        Executive's age.
     * @param jobTitle   Executive's job title.
     * @param department Executive's department.
     * @param companyCar Executive's company car.
     */
    Executive(String name, int age, String jobTitle, String department, String companyCar) {
        super(name, age, jobTitle, department); // Calls Manager constructor.
        this.companyCar = companyCar;
    }

    /** Overrides introduce() to display name, age, and job title, department, and company car. */
    @Override
    public void introduce() {
        System.out.println("\nIntroducing Executive:");
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Job Title: " + this.jobTitle + ", Department: " + this.department + ", Company Car: " + this.companyCar);
    }
}