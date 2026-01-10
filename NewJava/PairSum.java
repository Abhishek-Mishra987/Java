package NewJava;

import java.util.Arrays;

public class PairSum {
    public static int pairSum(int[] arr, int target){
        int count = 0;
        int sum;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];  
                if(sum == target){
                    ++count;
                }
            }
        }
        return count;
    }


    //Method 2:
    //This method uses the two-pointer technique, which ONLY works on a sorted array


    public static int betterPairSum(int[] arr, int target) {
        Arrays.sort(arr);    // we have sorted array here

        int count = 0;
        int sum;
        int start = 0, end = arr.length - 1;
        while(start < end){
            sum = arr[start]+arr[end];
            if(sum==target){
                ++count;
                start++;
                end--;
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,8,6,7,9};
        System.out.println(betterPairSum(arr, 7));
    }
}

