package a35_employeepayrollsystem_finalassignment;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    // Menu constants
    static final String FULL_TIME_EMPLOYEE = "1";
    static final String PART_TIME_EMPLOYEE = "2";
    static final String EXIT = "3";

    public static void main(String[] args) {

        // Displays main menu and handles user choice
        while (true) {
            displayOptions();

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case FULL_TIME_EMPLOYEE:
                    handleFullTimeEmployee();
                    break;
                case PART_TIME_EMPLOYEE:
                    handlePartTimeEmployee();
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-3 only.\n");
                    break;
            }
        }
    }

    /** Displays the main menu options. */
    private static void displayOptions() {
        System.out.println("=====================================");
        System.out.println("       Employee Payroll System");
        System.out.println("=====================================\n");

        System.out.println("------- Select Employee Type --------");
        System.out.println("1. Full Time Employee");
        System.out.println("2. Part Time Employee");
        System.out.println("3. Exit");
    }

    /** Handles the input and processing for creating a Full Time Employee. */
    private static void handleFullTimeEmployee() {
        String empName = getValidatedInput("Name");
        String empID = getValidatedInput("ID");
        String empRole = getValidatedInput("Role");
        String empDepartment = getValidatedInput("Department");
        double empRate = getValidatedRateInput();
        int hoursWorked = getValidatedHoursInput();

        // Create FullTimeEmployee object and process payroll
        FullTimeEmployee fte = new FullTimeEmployee(empName, empID, empRole, empDepartment, empRate, hoursWorked);

        fte.computeSalary();
        fte.displaySummary();
        fte.generatePayslip();
    }

    /** Handles the input and processing for creating a Part Time Employee. */
    private static void handlePartTimeEmployee() {
        String empName = getValidatedInput("Name");
        String empID = getValidatedInput("ID");
        String empRole = getValidatedInput("Role");
        String empDepartment = getValidatedInput("Department");
        double empRate = getValidatedRateInput();
        int hoursWorked = getValidatedHoursInput();

        // Create PartTimeEmployee object and process payroll
        PartTimeEmployee pte = new PartTimeEmployee(empName, empID, empRole, empDepartment, empRate, hoursWorked);

        pte.computeSalary();
        pte.displaySummary();
        pte.generatePayslip();
    }

    /**
     * Validates and returns a non-empty String input from the user.
     * 
     * @param label the label to display when prompting the user
     * @return a valid non-empty String input
     */
    private static String getValidatedInput(String label) {
        while (true) {
            System.out.print("Enter " + label + ": ");
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println(label + " cannot be blank. Please try again.");
            }
        }
    }

    /**
     * Validates and returns a positive double value for hourly rate.
     * 
     * @return validated hourly rate
     */
    private static double getValidatedRateInput() {
        while (true) {
            System.out.print("Enter Hourly Rate: ");
            String rateInput = scanner.nextLine().trim();
            try {
                double empRate = Double.parseDouble(rateInput);
                if (empRate < 0) {
                    throw new NegativeInputException("Rate must be positive. Please try again.");
                }
                return empRate;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please try again.");
            } catch (NegativeInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Validates and returns a positive integer value for hours worked.
     * 
     * @return validated hours worked
     */
    private static int getValidatedHoursInput() {
        while (true) {
            System.out.print("Enter Hours Worked: ");
            String hoursWorkedInput = scanner.nextLine().trim();
            try {
                int hoursWorked = Integer.parseInt(hoursWorkedInput);
                if (hoursWorked < 0) {
                    throw new NegativeInputException("Hours worked must be positive. Please try again.");
                }
                return hoursWorked;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please try again.");
            } catch (NegativeInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}