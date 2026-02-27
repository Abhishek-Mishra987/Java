package OOPS;

public class This2 {
    private int length, breadth, height;
    public This2(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public This2(int side){
        this(side,side,side);
    }
    public This2(){
        this(0,0,0);
    }
    public void show(){
        System.out.println("Length: "+length+", Breadth: "+breadth+", Height: "+height);
    }

    public static void main(String[] args) {
        This2 bx1 = new This2(10,20,30);
        This2 bx2 = new This2(10);
        This2 bx3 = new This2();
        bx1.show();
        bx2.show();
        bx3.show();

    }
}
