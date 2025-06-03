package customer;

public class Customer {
    private String firstName ;
    private String lastName ;
    private int telepfoneNumber ;
    private String address ;


    public Customer (String firstName, String lastName, int telepfoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telepfoneNumber = telepfoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTelepfoneNumber() {
        return telepfoneNumber;
    }

    public void setTelepfoneNumber(int telepfoneNumber) {
        this.telepfoneNumber = telepfoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

