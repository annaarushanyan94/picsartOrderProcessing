package customer;


    public class Customer implements Comparable<Customer> {
        private String firstName;
        private String lastName;
        private int telephoneNumber;
        private String address;

        public Customer(String firstName, String lastName, int telephoneNumber, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.telephoneNumber = telephoneNumber;
            this.address = address;
        }

        // Getters and Setters ...

        @Override
        public int compareTo(Customer other) {
            int result = this.firstName.compareToIgnoreCase(other.firstName);
            if (result == 0) {
                result = this.lastName.compareToIgnoreCase(other.lastName);
            }
            if (result == 0) {
                result = this.address.compareToIgnoreCase(other.address);
            }
            return result;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " - " + address;
        }

}
   /* private String firstName ;
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
}*/


