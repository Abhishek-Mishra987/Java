package OOPS;

public class ThisK {
    private int roll;
    private String name;
    private double per;
    public void setStudent(int roll, String name, double per){
        this.roll = roll;
        this.name = name;
        this.per = per;
    }
    public void showStudent(){
        System.out.println("Roll: "+roll+", Name: "+name+", Percentage: "+per);
    }

public static void main(String[] args) {
        ThisK t = new ThisK();
        t.setStudent(23, "Aman", 72.56);
        t.showStudent();
    }

}