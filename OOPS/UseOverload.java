package OOPS;

public class UseOverload {
    public static void main(String[] args) {
        Overload obj = new Overload();
        System.out.println("Sum of 10 and 20 is: "+ obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30 is: "+ obj.add(10, 20, 30));
        System.out.println("Sum of 18.4 and 20.7 is: "+ obj.add(18.4, 20.7));
        System.out.println("Concatination of Abhi and shek is: "+ obj.add("Abhi", "shek"));


    }
}
