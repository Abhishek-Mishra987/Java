package Others;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class EmployeeStats {
    public static void main(String[] args) {

        // Employee "DB"
        List<Employee> employees = List.of(
            new Employee(1, "Aman", 25, 50000),
            new Employee(2, "Riya", 30, 60000),
            new Employee(3, "Raj", 28, 55000),
            new Employee(4, "Neha", 35, 70000)
        );

        // Min Age
        int minAge = employees.stream()
                              .mapToInt(e -> e.age)
                              .min()
                              .orElse(0);

        // Max Age
        int maxAge = employees.stream()
                              .mapToInt(e -> e.age)
                              .max()
                              .orElse(0);

        // Average Age
        double avgAge = employees.stream()
                                 .mapToInt(e -> e.age)
                                 .average()
                                 .orElse(0.0);

        // Sum of Ages
        int sumAge = employees.stream()
                              .mapToInt(e -> e.age)
                              .sum();

        // Salary statistics (min, max, avg, sum)
        DoubleSummaryStatistics salaryStats =
            employees.stream()
                     .collect(Collectors.summarizingDouble(e -> e.salary));

        // Output
        System.out.println("Min Age: " + minAge);
        System.out.println("Max Age: " + maxAge);
        System.out.println("Average Age: " + avgAge);
        System.out.println("Sum of Ages: " + sumAge);

        System.out.println("Min Salary: " + salaryStats.getMin());
        System.out.println("Max Salary: " + salaryStats.getMax());
        System.out.println("Average Salary: " + salaryStats.getAverage());
        System.out.println("Sum Salary: " + salaryStats.getSum());
    }
}
