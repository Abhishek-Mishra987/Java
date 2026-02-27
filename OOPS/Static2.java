package OOPS;

class Emp{
    private int age;
    private String name;
    private static String company = "Amazon";

    public Emp(int a, String n){
        age = a;
        name = n;
    }
    public void display(){
        System.out.println("age: "+age+", name: "+name+", comp: "+company);
    }

    public static void showCompany(){
        System.out.println("Company name is: "+company);
    }
}

public class Static2 {
    public static void main(String[] args) {
        Emp.showCompany();
        Emp e = new Emp(21,"Abhishek");
        Emp f = new Emp(20,"Mishra");
        Emp g = new Emp(19,"Rohit");

        e.display();
        f.display();
        g.display();
    }
}
