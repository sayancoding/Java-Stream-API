import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Employee;

public class S9_NestedMapping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Muna", "IT", 75000),
                new Employee("Runa", "HR", 50000),
                new Employee("Kua", "Finance", 62000),
                new Employee("Miku", "IT", 58000),
                new Employee("Sonu", "IT", 39000),
                new Employee("Sai", "HR", 55000),
                new Employee("Devender", "Finance", 45000),
                new Employee("mark", "HR", 35000)

        );

        Map<String,Map<Boolean, List<String>>> result = 
                employees.stream()
                .collect(Collectors.groupingBy(
                    emp -> emp.getDept(),
                    Collectors.partitioningBy(
                        emp -> emp.getSalary() > 5000,
                        Collectors.mapping(Employee::getName, Collectors.toList()))
                ));

        System.out.println(result);

        
        Map<String,Long> countByDept = employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDept,Collectors.summingLong(Employee::getSalary)));
        System.err.println(countByDept);


    }
}

