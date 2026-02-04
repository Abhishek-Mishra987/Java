//This code creates a list of students, then uses Java Streams with Collectors.groupingBy to group students by their department.
// It counts how many students are in each department and prints that count (like CSE -> 2).


// Stream:
// 👉 A Stream is used to process a collection of data step-by-step in a functional way.

// Collectors:
// 👉 Collectors are helper methods used to convert a stream into a final result like a List, Map, or summary.

// groupingBy:
// 👉 groupingBy is a collector that groups elements based on a key and returns a Map
package Others;
import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String dept;
    int marks;

    Student(String name, String dept, int marks) {
        this.name = name;
        this.dept = dept;
        this.marks = marks;
    }
}

public class collectors {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Aman", "CSE", 80),
            new Student("Riya", "ECE", 70),
            new Student("Raj", "CSE", 85),
            new Student("Neha", "ME", 60)
        );

        // Group students by department
        Map<String, List<Student>> grouped =
            students.stream()
                    .collect(Collectors.groupingBy(s -> s.dept));

        grouped.forEach((dept, list) -> {
            System.out.println(dept + " -> " + list.size());
        });
    }
}
