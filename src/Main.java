public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bank tomKCBAccount = new Bank();

        tomKCBAccount.setPhoneNumber("0723456257");
        tomKCBAccount.setAccountNumber(34567);
        tomKCBAccount.setCustomerName("Tom Jackson");
        tomKCBAccount.setEmail("jackwest@gmail.com");
        tomKCBAccount.deposit(20000);

        tomKCBAccount.withdrawal(1000);
        tomKCBAccount.withdrawal(1000);

        tomKCBAccount.deposit(12000);

        tomKCBAccount.describeAc();

        Account defau = new Account();

        Customer client = new Customer();

    }
}