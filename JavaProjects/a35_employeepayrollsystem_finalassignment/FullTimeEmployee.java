package a35_employeepayrollsystem_finalassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Class to represent a full-time employee.
 * Handles salary computation, payslip generation, and data validations.
 */
public class FullTimeEmployee extends Employee implements Payable, Printable {
    private double empRate;
    private int hoursWorked;
    private double tax;
    private double grossSalary;

    private static final double TAX_DEDUCTION = 0.10;
    private static final String FULL_TIME_TYPE = "Full Time Employee";
    private static final String FULL_TIME_PREFIX_ID = "FTE-";

    /**
     * Constructs a FullTimeEmployee object with salary-related attributes.
     * Prefixes 'FTE-' to employee ID to easily identify full-time employees.
     */
    FullTimeEmployee(String empName, String empID, String empRole, String empDepartment, double empRate,
            int hoursWorked) {
        super(empName, FULL_TIME_PREFIX_ID + empID, empRole, empDepartment);
        this.empRate = empRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Calculates gross salary and tax, and returns net salary.
     * 
     * @return net salary after tax deduction
     */
    @Override
    public double computeSalary() {
        grossSalary = empRate * hoursWorked;
        tax = grossSalary * TAX_DEDUCTION;
        return grossSalary - tax;
    }

    /**
     * Generates a payslip txt file containing salary breakdown and employee details.
     */
    @Override
    public void generatePayslip() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(
                "FTE_payslips\\" + getEmpID() + "_payslip.txt"))) {
            bw.write("=====================================\n");
            bw.write("               Payslip\n");
            bw.write("=====================================\n\n");

            bw.write(super.toString() + "\n");
            bw.write("Employment Type: " + FULL_TIME_TYPE + "\n\n");

            bw.write(String.format("Rate per Hour:      ₱%,.2f%n", empRate));
            bw.write(String.format("Hours Worked:       %d%n%n", hoursWorked));
            bw.write(String.format("Gross Salary:       ₱%,.2f%n", grossSalary));
            bw.write(String.format("Tax Deducted (10%%): ₱%,.2f%n%n", tax));
            bw.write(String.format("Net Salary:         ₱%,.2f%n", computeSalary()));

            bw.write("\n-------------------------------------\n");
            bw.write("This is system generated payslip.\n");
            bw.write("Date Generated: " + LocalDate.now() + "\n");
            bw.write("=====================================\n");

            System.out.println("\nPayslip for " + getEmpName() + " successfully generated and saved as " + getEmpID() + "_payslip.txt.\n");
        } catch (IOException e) {
            System.out.println("Error generating payslip: " + e.getMessage());
        }
    }

    /** Display summary of the employee's salary computation. */
    public void displaySummary() {
        System.out.println("\n" + getEmpName() + "'s Payslip Summary:");
        System.out.println(String.format("Gross Salary: PHP %,.2f", grossSalary));
        System.out.println(String.format("Tax Deducted (10%%): PHP %,.2f", tax));
        System.out.println(String.format("Net Salary: PHP %,.2f", computeSalary()));
    }
}