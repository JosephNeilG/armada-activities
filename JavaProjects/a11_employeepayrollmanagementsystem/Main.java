package a11_employeepayrollmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Payroll Management System\n");

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    calculateAnnualSalary();
                    break;
                case 4:
                    raiseSalary();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-5 only.");
                    break;
            }
        }
    }

    static void addEmployee() {
        String name;
        while (true) {
            System.out.print("Enter employee name: ");
            name = scanner.nextLine().trim();

            if (name.isEmpty()) {System.out.println("Name cannot be empty. Please enter a name.");
            } else {
                break;
            }
        }

        int id;
        while (true) {
            System.out.print("Enter employee ID: ");
            id = scanner.nextInt();
            scanner.nextLine();

            if (isIdDuplicate(id)) {
                System.out.println("Employee ID already exists. Please enter a unique ID.");
            } else {
                break;
            }
        }

        double salary;
        while (true) {
            System.out.print("Enter employee salary: ");
            salary = scanner.nextDouble();
            scanner.nextLine();

            if (salary < 0) {
                System.out.println("Salary cannot be negative. Please enter a valid salary.");
            } else {
                break;
            }
        }

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        Employee newEmployee = new Employee(name, id, salary, department);
        employees.add(newEmployee);

        System.out.println("Employee added successfully!\n");
    }

    static boolean isIdDuplicate(int id) {
        for (Employee employee : employees) {
            if (employee.employeeID == id) {
                return true;
            }
        }
        return false;
    }

    static void viewAllEmployees() {
        if (!validateEmployeeList()) return;

        System.out.println("--- Employee Records ---\n");

        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }

    static void calculateAnnualSalary() {
        if (!validateEmployeeList()) return;

        System.out.print("Enter employee ID to calculate salary: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.employeeID == id) {
                System.out.printf("Annual Salary of %s: $%.2f%n\n", employee.name, employee.calculateAnnualSalary());
                return;
            }
        }
        System.out.println("Employee not found.\n");
    }

    static void raiseSalary() {
        if (!validateEmployeeList()) return;

        System.out.print("Enter employee ID to raise salary: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.employeeID == id) {
                System.out.print("Enter percentage increase: ");
                double percentage = scanner.nextDouble();
                System.out.printf("Salary updated successfully! New Salary: $%.2f%n\n", employee.raiseSalary(percentage));
                return;
            }
        }
        System.out.println("Employee not found.\n");
    }

    static boolean validateEmployeeList() {
        if (employees.isEmpty()) {
            System.out.println("Employee record is empty.\n");
            return false;
        }
        return true;
    }
}