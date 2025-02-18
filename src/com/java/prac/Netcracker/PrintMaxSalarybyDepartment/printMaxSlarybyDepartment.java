package com.java.prac.Netcracker.PrintMaxSalarybyDepartment;

import com.java.prac.Netcracker.Emp;

import java.util.*;
import java.util.stream.Collectors;

public class printMaxSlarybyDepartment {
    public static void main(String args[]){
    List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 60000),
            new Employee("Amit", "IT", 80000),
            new Employee("Bob", "IT", 70000),
            new Employee("Alex", "HR", 75000),
            new Employee("Arun", "Finance", 90000),
            new Employee("John", "Finance", 65000)
    );

    Map<String, Optional<Employee>> m1=employees.stream().filter(e -> e.getName().startsWith("A"))
            .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

    for(Map.Entry<String, Optional<Employee>> entry: m1.entrySet()){
        System.out.println("Department: "+entry.getKey()+ "Max Salary: "+entry.getValue().get().getSalary());
    }
    }
}
