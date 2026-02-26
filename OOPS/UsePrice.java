package OOPS;

public class UsePrice {
    public static void main(String[] args) {
            Price p = new Price(101, "Maggi",567.87);
            p.setName("Maggi masala");
            System.out.println(p.getId());
            System.out.println(p.getName());
            System.out.println(p.getPrice());


    }
}
