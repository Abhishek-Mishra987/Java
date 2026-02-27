package OOPS;

import java.util.Scanner;

public class StaticF {
    private int accId;
    private String name;
    private double balance;
    private static double roi;
    static{
        System.out.println("Enter roi:");
        Scanner sc = new Scanner(System.in);
        roi = sc.nextDouble();
    }

    public StaticF(int id, String n, double bal){
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
