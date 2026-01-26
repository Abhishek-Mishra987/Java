package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        System.out.println("As of now size of Arraylist is: "+ months.size());
        months.add("Mar");
        months.add("Apr");
        months.add(2,"May");
        months.set(0,"January");
        // System.out.println(months);
        String s1 = months.get(0);
        System.out.println(s1);
        String s2 = months.get(1);
        System.out.println(s2);
        String s3 = months.get(2);
        System.out.println(s3);
        System.out.println(months);
    }
}
