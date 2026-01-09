package JavaConcepts.firstF;

import java.util.*;
public class ReverseStr {

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length-1;
        
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        System.out.println("Original String: "+ input);
        System.out.println("Reversed String: "+ reverseString(input));
    }
}
