package NewJava;

import java.util.Arrays;

public class SwapAdj {

    public static int[] swap(int[] arrp) {
        int[] arr = arrp.clone();
        int temp;
        for(int i=0; i<arr.length-1; i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
        
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        for(int x:swap(arr)){
            System.out.println(x);
        }
    }
}
