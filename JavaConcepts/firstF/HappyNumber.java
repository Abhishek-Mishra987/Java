package JavaConcepts.firstF;

import java.util.*;

public class HappyNumber{

    public static boolean isHappy(int n){
        HashSet<Integer> hs = new HashSet<>();

        while(!hs.contains(n)){
            hs.add(n);
            int sqrSum = 0;
            while(n != 0){
                int rem = n % 10;
                sqrSum += rem * rem;
                n = n/10;
            }
            if(sqrSum == 1) return true;
            else n = sqrSum;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(35));
    }
}