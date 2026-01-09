package NewJava;

public class Secondlargest {

    public static int findSecondLagest(int[] arr){
        int max,secMax;
        max = secMax = Integer.MIN_VALUE;
        for(int x : arr){
            if(x > max){
                secMax = max;
                max = x;
            }else{
                if(x > secMax && x != max){
                    secMax = x;
                }
            }
        }
        return secMax;
    }


    public static void main(String[] args) {
        int [] arr = {45,32,22,37,12,33};
        System.out.println(findSecondLagest(arr));
    }
}
