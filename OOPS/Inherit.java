package OOPS;

public class Inherit {
    public void start(){
        System.out.println("Starting the car....");
    }

    public void accelerate(){
        System.out.println("accelerating....");
    }
    public void turnLeft(){
        System.out.println("Turning left....");
    }
}

class Car extends Inherit{
    public void reverse(){
        System.out.println("reversing....");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.turnLeft();
        c.reverse();
    }
}
