package com.company.service;

import com.company.model.Employee;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    private Employee[] listEmployee = new Employee[3];
    private int numberofEmployee = 0;

    @Override
    public void add(Employee employee) {
        listEmployee[numberofEmployee] = employee;
        numberofEmployee ++;
    }

    @Override
    public void print() {
        for (int i=0; i<numberofEmployee; i++){
            System.out.println(listEmployee[i]);
        }
        System.out.println("-------------------");
    }

    public int findIndex(int id){
        int index = -1;
        for (int i=0; i<numberofEmployee; i++){
            if (listEmployee[i].getId() == id)
                index = i;
        }
        return index;
    }
    @Override
    public void find(int id) {
        if (this.findIndex(id) == -1) System.out.println("Can't find employee");
        else {
            for (int i=0; i<numberofEmployee; i++){
                System.out.println(listEmployee[this.findIndex(id)]);
            }
        }
    }

    @Override
    public void update(Employee employee, int id) {
        listEmployee[findIndex(id)] = employee;
    }

    @Override
    public void delete(int id) {
        Employee[] newListEmployee = new Employee[2];
            for (int i=0; i<findIndex(id); i++){
                newListEmployee[i] = listEmployee[i];
            }
            for (int i=findIndex(id) + 1; i<numberofEmployee; i++){
                newListEmployee[i-1] = listEmployee[i];
            }
            for (int i = 0; i < newListEmployee.length; i++) {
                System.out.println("\n" + newListEmployee[i]);
            }
        }


    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Employee employee1 = new Employee(1, "Duy dz", "C0821I1 Group", 1000);
        Employee employee2 = new Employee(2, "Binh gold", "C0821I1 Group", 1000);
        Employee employee3 = new Employee(3, "Huong giao su", "C0821I1 Group", 1000);
        employeeService.add(employee1);
        employeeService.add(employee2);
        employeeService.add(employee3);
        employeeService.print();
        Employee employee4 = new Employee(4, "Long ne", "C0821I1 Group", 1000);
        employeeService.update(employee4,3);
        employeeService.print();

    }
}
