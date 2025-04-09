package a32_studentgrademanagementsystem;

public class Student {
    private String name;
    private double grade;

    /**
     * Gets the student's name.
     *
     * @return The name of the student.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the student's name.
     * Prints an error message if the name is null or empty.
     *
     * @param name The name to set for the student.
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("ERROR: Student name cannot be empty.");
        }
    }

    /**
     * Gets the student's grade.
     *
     * @return The grade of the student.
     */
    public double getGrade() {
        return this.grade;
    }

    /**
     * Sets the student's grade.
     * Grade must be between 0 and 100. If invalid, grade is set to -1.
     *
     * @param grade The grade to set for the student.
     */
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("ERROR: Student grade must be between 0 and 100.");

            this.grade = -1;
        }
    }

    /** Displays the student's name and grade. */
    public void displayStudentInfo() {
        System.out.println(getName() + " - " + getGrade());
    }
}