import Bank.Bank;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;

    // exercise 9: ensure that a Customer instance can not be created without a name and an
    //initial deposit
    private Customer () {
     // do nothing
    }

    public Customer ( int customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters
    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // setters

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // try to access bank vault in exercise 8
    public void accessVault() {
        Bank bank = new Bank();
        // System.out.println(bank.vault); // error
    }

    @Override
    public String toString() {
        return (
                        "CustomerID: " + customerId +
                        ", CustomerName: " + firstName + "" + lastName
                );
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Mikan", "Sleepy");
        System.out.println(customer1);

    }
}
