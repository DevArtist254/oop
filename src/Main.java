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

        listStudent();

        listDAStudent();
    }

    public static void listStudent() {

        for (int c = 0;c <= 5;c++ ){
            Student stu = new Student(
                    switch (c) {
                        case 0 -> "mary";
                        case 1 -> "bob";
                        case 2 -> "jack";
                        case 3 -> "jill";
                        case 4 -> "Slay";
                        case 5 -> "Sloan";
                        default -> "Anom";
                    },
                    "199"+c,
                    "stu291223"+ c,
                    "Java master class"
            );

            System.out.println(stu);
        }
    }

    public static void listDAStudent() {

        for (int c = 0;c <= 5;c++ ){
            DAStudent stu = new DAStudent(
                    switch (c) {
                        case 0 -> "mary";
                        case 1 -> "bob";
                        case 2 -> "jack";
                        case 3 -> "jill";
                        case 4 -> "Slay";
                        case 5 -> "Sloan";
                        default -> "Anom";
                    },
                    "199"+c,
                    "stu291223"+ c,
                    "Java master class"
            );

            System.out.println(stu);
        }
    }
}