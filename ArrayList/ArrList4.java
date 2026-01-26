package ArrayList;

import java.util.ArrayList;

public class ArrList4 {

    public static ArrayList<Integer> getInsertion(int[]arr, int n, int []brr, int m){
        ArrayList<Integer> result = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            int x=arr[i];
            int y=brr[j];
            if(x==y){
                result.add(x);
                i++;
                j++;
            } else if(x<y){
                i++;
            }else{
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {1,2,2,2,3,4};
        int []brr = {2,2,3,3};
        System.out.println(getInsertion(arr, arr.length, brr, brr.length));
    }
}
