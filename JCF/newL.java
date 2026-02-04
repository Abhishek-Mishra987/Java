package JCF;

import java.util.*;

public class newL {
    public static void main(String[] args) {
        //  ===================  List ====================
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);   
        list.add(1,15);
        System.out.println("List: " + list);

        List<Integer> newList = new ArrayList<>();
        newList.add(30);
        newList.add(40);
        list.addAll(newList);
        System.out.println("After adding newList to list: " + list);

        // Remove element
        list.remove(Integer.valueOf(20)); // Remove element 20
        list.remove(0); // Remove element at index 0 (15)
        System.out.println("After removing 20 and 10: " + list);

        // delete all elements
        // list.clear();


        // Set element at index
        list.set(0, 25); // Set index 0 to 25
        System.out.println("After setting index 0 to 25: " + list);

        // ======== Iterate over list ==========
        System.out.print("Iterating over list: ");
        // Using for-each loop
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    System.out.println();

        // Using iterator
        Iterator<Integer> it = list.iterator();
        System.out.print("Using iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Using for loop with index
        System.out.print("Using for loop with index: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();




        

        // =================== Set ====================
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, won't be added
        System.out.println("Set: " + set);

        // =================== Map ====================
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Uno"); // Update value for key 1
        System.out.println("Map: " + map);

        // Get value by key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);
    }
}
