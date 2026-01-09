package JavaConcepts.firstF;
import java.util.Scanner;
public class IntToStrBI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Convert integer to string using built-in method
        String str = String.valueOf(num);

        System.out.println("String representation: " + str);
        System.out.println(str.getClass().getName());

        sc.close();
    }
}
