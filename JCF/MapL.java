package JCF;

import java.util.HashMap;
import java.util.Map;

public class MapL {
    public static void main(String[] args) {
    Map<String, Integer> num = new HashMap<>();
    // similarly treemap and linkedhashmap can be used for sorted and insertion order respectively.
    num.put("One", 1);
    num.put("Two", 2);
    num.put("Three", 3);
    num.put("Four", 4);
    num.put("Five", 5);
    System.out.println("Map: " + num);
    System.out.println("Value for 'Three': " + num.get("Three"));
    System.out.println("Contains key 'Four'? " + num.containsKey("Four"));
    System.out.println("Remove key 'Two': " + num.remove("Two"));
    System.out.println("After removal, Map: " + num);

    num.putIfAbsent("Five", 5); // Will not add as 'Five' already exists
    num.putIfAbsent("Six", 6); // Will add as 'Six' does
    }
}
