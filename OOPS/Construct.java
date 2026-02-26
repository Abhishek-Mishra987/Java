package OOPS;

public class Construct {
    private int accId;
    private String name;
    private double balance;

    public Construct(int id, String n, double bal){
        accId = id;
        name = n;
        balance = bal;
    }

    public void showAccount(){
        System.out.println("Id: "+accId);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}
