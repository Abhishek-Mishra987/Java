package OOPS;
import OOPS2.first2;

public class first {
    public static void main(String[] args) {
        Person p1 = new Person();
        second s1 = new second();
        first2 f2 = new first2();
        Person p2 = new Person();

        p1.name = "Abhishek";
        p1.age = 22;
        p1.gender = 'M';

        // System.out.println("Name: "+ p1.name);
        // System.out.println(s1.salary);
        // System.out.println(f2.runs);

        p2.name = "Mishra";
        p2.age = 21;
        p2.gender = 'M';

        p1.walk();
        p2.code();
        p1.walk(1000);

        System.out.println(Person.count);
    }
}

class Person{
    String name;
    int age;
    char gender;
    static int count;        
    
    //Java me:
// static → class se belong karta hai
// non-static → object se belong karta hai

    public Person(){
        count++;
        System.out.println("Creating an object");
    }

    void walk(){
        System.out.println(name + " is walking!");
    }

    void walk(int steps){
        System.out.println(name + " is walking "+ steps);
    }

    void code(){
        System.out.println(name + " is coding!");
    }
}
