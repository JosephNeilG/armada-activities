package a35_employeepayrollsystem_finalassignment;

/**
 * Abstract class to represent a general Employee.
 * Holds common properties shared by all employee types.
 */
public abstract class Employee {
    private String empName;
    private String empID;
    private String empRole;
    private String empDepartment;

    /** Constructor to initialize employee information. */
    Employee(String empName, String empID, String empRole, String empDepartment) {
        this.empName = empName;
        this.empID = empID;
        this.empRole = empRole;
        this.empDepartment = empDepartment;
    }

    /**
     * Gets the employee's name.
     * 
     * @return employee name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Gets the employee's ID.
     * 
     * @return employee ID
     */
    public String getEmpID() {
        return empID;
    }

    /**
     * Returns a formatted string representing the employee details.
     */
    @Override
    public String toString() {
        return "Employee Name:   " + empName + "\n" +
                "Employee ID:     " + empID + "\n" +
                "Role:            " + empRole + "\n" +
                "Department:      " + empDepartment;
    }
}