package OOPS;

public class Student {
    private int roll;
    private String name;
    private double percentage;

    public void setStudent(int r, String s, double p){
        roll = r;
        name = s;
        percentage = p;
    }
    public void showStudent(){
        System.out.println("Roll = "+roll);
        System.out.println("Name = "+name);
        System.out.println("Perc = "+percentage);
    }
}
