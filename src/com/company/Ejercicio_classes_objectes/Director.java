package com.company.Ejercicio_classes_objectes;

public class Director {

    private int empId;
    private String name;
    private int ssn;
    private double salary;
    private double budget;

    public Director(int empId, String name, int ssn, double salary, double budget){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        this.budget = budget;
    }
    public void printDirector(){
        System.out.println(empId + name + ssn + salary);
    }
}
