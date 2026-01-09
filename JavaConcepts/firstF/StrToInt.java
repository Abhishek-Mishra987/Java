package JavaConcepts.firstF;
import java.util.*;
public class StrToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string number: ");
        String str = sc.nextLine();

        long num = 0;
        int i = 0;
        boolean isNegative = false;

        if(str.charAt(0) == '-'){
            isNegative = true;
            i = 1;
        }

        for(; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch < '0' || ch > '9'){
                System.out.println("Invalid input");
                return;
            }

            int digit = ch - '0';

            if(!isNegative && num > (Integer.MAX_VALUE - digit) / 10){
                System.out.println("Overflow detected");
                return;
            }
            if(isNegative && -num < (Integer.MIN_VALUE + digit) / 10){
                System.out.println("Overflow detected");
                return;
            }

            num = num * 10 + digit;
        }
        if(isNegative){
            num = -num;
        }

        System.out.println("Integer value: "+ num);
        sc.close();
    }
}
