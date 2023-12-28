public class Account {
    private final String number;
    private final String name;
    private final String phone;


    public Account(){
        this("John doe", "0825032593", "23409782390");

        System.out.println("Empty constructor called");
        System.out.println(name + " " + phone + " " + number);
    }

    public Account(String name, String phone, String number){
        this.name = name;
        this.phone = phone;
        this.number = number;
    }
}
