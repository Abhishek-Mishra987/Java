package JavaConcepts.firstF;
import java.util.Scanner;
public class StrToIntBI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string number: ");
        String str = sc.next();

        try {
            int num = Integer.parseInt(str);
            System.out.println("Integer value: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input — not a valid integer!");
        }

        sc.close();
    }
}
