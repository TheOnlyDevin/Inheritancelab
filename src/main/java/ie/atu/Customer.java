package ie.atu;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;

    public Customer() {
    }

    public Customer(String name, String address, String number, String customerNumber, boolean mailingList) {
        super(name, address, number);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + " " +
                "customerNumber='" + customerNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
