package JavaConcepts.firstF;

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked: ");
        int num, temp = 0;
        num = sc.nextInt();

        for(int i=2; i<num; i++){
            if(num % i == 0){
                temp = 1;
            }
        }
        if(temp != 1){
            System.out.println("Number is prime.");
        }
        else{
            System.out.println("Number is composite.");
        }
    }
}