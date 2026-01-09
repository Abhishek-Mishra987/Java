package JavaConcepts.firstF;

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println("Before Swap: a = "+ a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    } 
}
