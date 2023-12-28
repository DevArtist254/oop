public class Customer {

    private final String customerName;

    private final String email;

    private final double creditLimit;

    public Customer(String customerName, double creditLimit, String email){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;

        System.out.println("name: " + customerName + "\r\ncreditLimit: " + creditLimit + "\r\nemail: "+ email);
    }

    public Customer(String customerName, String email){
        this(customerName, 500, email);
    }

    public Customer(){
        this("John Doe", 500, "john@doe.com");
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


}
