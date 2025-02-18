package com.java.prac.Netcracker.PrintMaxSalarybyDepartment;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getName(){
    return name;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Emp{name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }

}
