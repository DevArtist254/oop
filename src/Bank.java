public class Bank {
    private String customerName;

    private String email;

    private String phoneNumber;

    private int accountNumber;

    private int balance = 0;

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void withdrawal(int amount){

        if (amount > this.balance) {

            System.out.println("Funds are not available for withdrawal");
        } else {
            this.balance -= amount;

            System.out.println("Successful withdrawal, your new bank balance is: " +  this.balance);
        }
    }

    public void deposit(int amount){

        this.balance += amount;

        System.out.println("Successful deposit, your new bank balance is: " +  this.balance);
    }

    public void describeAc(){
        System.out.println(
                "New account created with the following details: \r\n"
                   +"Username: "+ customerName + ",\r\n"
                + "Account number: "+ accountNumber + ",\r\n"
                + "Account balance: "+ balance
        );
    }
}
