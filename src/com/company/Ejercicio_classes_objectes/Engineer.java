package com.company.Ejercicio_classes_objectes;

public class Engineer {
    private int empId;
    private String name;
    private int ssn;
    private double salary;


    public Engineer(int empId, String name, int ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;

    }
    public void printEngineer(){
        System.out.println(empId + name + ssn + salary);
    }
}
