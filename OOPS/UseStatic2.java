package OOPS;

public class UseStatic2 {
    public static void main(String[] args) {
        StaticF c = new StaticF(101, "Abhishek", 2345.98);
        StaticF c2 = new StaticF(102, "Mishra", 456.34);
        c.showAccount();
        c2.showAccount();

    }
}
