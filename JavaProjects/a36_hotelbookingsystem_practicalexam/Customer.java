package a36_hotelbookingsystem_practicalexam;

/** Represents a customer making reservation. */
public class Customer {
    private String name;
    private String email;
    private String membershipStatus;

    /** Constructs a Customer with the specified name, email, and membership status.*/
    Customer(String name, String email, String membershipStatus) {
        this.name = name;
        this.email = email;
        this.membershipStatus = membershipStatus;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }
}