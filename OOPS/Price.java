package OOPS;

public class Price {
    private int id;
    private String name;
    private double price;

    public Price(int i, String s, double p){
        id = i;
        name = s;
        price = p;
    }


    public void setName(String s){
        name = s;
    } 
    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

}
