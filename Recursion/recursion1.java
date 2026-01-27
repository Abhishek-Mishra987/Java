package Recursion;

public class recursion1 {
    public static void sayHello(int n) {
        if(n==0){
            return;
        }
        System.out.println("Hello");
        sayHello(n-1);
        System.out.println("Thank you");
    }

    public static void main(String[] args) {
        sayHello(3);
    }
}
