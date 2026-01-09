package JavaConcepts.firstF;

import java.util.Scanner;

public class IntToStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        char[] str = new char[20];
        int index = 0;

        if (num == 0) {
            str[index++] = '0';
        } else {
            while (num > 0) {
                int digit = num % 10;
                str[index++] = (char) ('0' + digit);
                num /= 10;
            }
        }

        if (isNegative) {
            str[index++] = '-';
        }

        // Reverse the char array
        for (int i = 0; i < index / 2; i++) {
            char temp = str[i];
            str[i] = str[index - i - 1];
            str[index - i - 1] = temp;
        }

        // Convert char array to String
        String result = new String(str, 0, index);

        System.out.println("String representation: " + result);
        System.out.println(result.getClass().getName());
    }
}
