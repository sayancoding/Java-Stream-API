import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Employee;

public class S5_IntermediateOps{
    public static void main(String[] args) {
        /*
         * Filter -> take a lambda/predicate where define filter logic 
         */
        List<Employee> itEmployees = employees.stream()
        .filter( em -> em.getDept().equalsIgnoreCase("IT"))
        .toList();
        System.out.println("\nIT Employee list ::");
        System.out.println(itEmployees);

        /*
         * Map -> take a lambda where define logic that applies to each item of stream 
         */
        List<Employee> employeesAfterHike = employees.stream()
        .map( em -> {
                double hike = (em.getSalary() * 50 )/100.00;
                em.setSalary(em.getSalary() + (int)hike);
                return em;
        })
        .toList();
        System.out.println("\nAfter salary hike employees ::");
        System.out.println(employeesAfterHike);

        /*
         * Sort -> Sort list by parameter 
         */
        List<Employee> sortedEmployeesBySalary = employees.stream()
        .sorted(Comparator.comparing(emp -> emp.getSalary()))
        .toList();
        System.out.println("\nSorted employees by salary ::");
        System.out.println(sortedEmployeesBySalary);

        /*
         * Limit -> set limit of how many item you want
         */
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("\nTop 3 salaried employee ::");
        System.out.println(sortedEmployees);

        /*
         * Skip -> set how many item you want to skip from beginning 
         */
        List<Employee> secondHighSalariedEmployee = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("\nSecond high salaried employee ::");
        System.out.println(secondHighSalariedEmployee);

        /*
         * Distinct -> Get list where each item occurs only one by removing duplicate 
         */
        List<Integer> numbers = Arrays.asList(10,12,8,45,10,24,12);
        List<Integer> distinctList = numbers.stream().distinct().toList();
        System.out.println("\nDistinct item list ::");
        System.out.println(distinctList);

    }

    public static List<Employee> employees = Arrays.asList(
                new Employee("Muna", "IT", 75000),
                new Employee("Runa", "HR", 50000),
                new Employee("Kuna", "Finance", 62000),
                new Employee("Miku", "IT", 72000),
                new Employee("Sonu", "IT", 64000),
                new Employee("mark", "HR", 55000)
        );
}