package com.company.Ejercicio_classes_objectes;

public class Manager {

    private int empId;
    private String name;
    private int ssn;
    private double salary;
    private String departament;

    public Manager(int empId, String name, int ssn, double salary, String departament){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        this.departament = departament;


    }
    public void printManager(){
        System.out.println(empId + name + ssn + salary);
    }
}
