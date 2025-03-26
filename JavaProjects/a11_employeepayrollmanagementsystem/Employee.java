package a11_employeepayrollmanagementsystem;
public class Employee {
    int employeeNumCount;
    String name;
    int employeeID;
    double salary;
    String department;

    static int employeeCounter = 0;

    public Employee() {
        this.employeeNumCount = 0;
        this.name = "Unknown";
        this.employeeID = 0;
        this.salary = 0.0;
        this.department = "Unknown";
    }

    public Employee(String name, int employeeID, double salary, String department) {
        employeeCounter++;
        this.employeeNumCount = employeeCounter;
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Employee " + this.employeeNumCount + ":");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.employeeID);
        System.out.printf("Salary: $%.2f%n", this.salary);
        System.out.println("Department: " + this.department);
        System.out.println();
    }

    public double calculateAnnualSalary() {
        return this.salary * 12.0;
    }

    public double raiseSalary(double percentage) {
        return this.salary += this.salary * (percentage / 100.0);
    }
}
