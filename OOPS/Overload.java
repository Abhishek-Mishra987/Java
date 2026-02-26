package OOPS;

public class Overload {
    public int add(int a, int b){
        int c = a+b;
        return c;
    }
     public int add(int a, int b, int c){
        int d = a+b+c;
        return d;
    }

    public double add(double i, double j){
        double k = i+j;
        return k;
    }
    public String add(String s1, String s2){
        return s1+s2;
    }
}
