package JCF;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetL {
    public static void main(String[] args) {
        //Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        set.add(32);
        set.add(45);
        set.add(12);
        set.add(45); // Duplicate, will not be added
        set.add(23);
        System.out.println("Set: " + set);
        System.out.println("Contains 12? " + set.contains(12));
        System.out.println("Remove 23: " + set.remove(23));
        System.out.println("After removal, Set: " + set);
        System.out.println("Size of Set: " + set.size());
        System.out.println("Is Set empty? " + set.isEmpty());
        // Note: HashSet does not maintain any order of elements
        // to maintain order, consider using LinkedHashSet(same insertion order) or TreeSet(ascending order)
        // clear the set
        set.clear();
        System.out.println("After clear, is Set empty? " + set.isEmpty());
    }
}
