package ArrayList;

import java.util.List;
import java.util.ArrayList;


public class ArrList2 {
    public static void reverse(List<Integer>arr, int m) {
        for(int i=m+1, j=arr.size()-1; i<j; i++,j--){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }
        System.out.println("After reversing");
        for(int x : arr){
            System.out.println(x+" ");
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(6);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        reverse(arr, 2);
    }
}
