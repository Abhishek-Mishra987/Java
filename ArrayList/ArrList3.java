package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrList3 {
    public static int[] findPosition(List<Integer>arr, int k) {
        int []pos = {-1, -1};
        int first = arr.indexOf(k);
        if(first == -1)
            return pos;
        int second = arr.lastIndexOf(k);
        pos[0] = first;
        pos[1] = second;
        return pos;


        
    }

    public static void main(String[] args) {
        List <Integer>arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        int []res = findPosition(arr, 2);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]+" ");
        }
    }
}
