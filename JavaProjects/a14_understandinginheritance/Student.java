package a14_understandinginheritance;

/** Subclass Student that inherits from Person class with additional attribute grade. */
public class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age); // Calls the constructor of the superclass (Person)
        this.grade = grade;
    }

    /**
     * Converts a numerical grade to a letter grade.
     *
     * @param grade The numerical grade to convert.
     * @return The corresponding letter grade as a String.
     */
    private String gradeConversion(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    /** Displays student grade. */
    public void displayGrade() {
        System.out.println("Grade: " + gradeConversion(this.grade));
    }
}