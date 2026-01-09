package JavaConcepts.firstF;

import java.util.*;
public class ReverseNum {

    public static int reverseNumber(int num){
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num/10;
        }
        return rev;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("Reversed number is: "+ reverseNumber(n));
    }
}
