package com.company.model;

public class Employee extends Person {
    double salary;

    public Employee(int id, String name, String company, double salary) {
        super(id, name, company);
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " +getId()+
                ", name = " +getName()+
                ", company = " +getCompany()+
                ", salary = " + salary +
                '}';
    }
}
