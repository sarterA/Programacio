package com.company.Ejercicio_classes_objectes;

public class Administrator {
    private int empId;
    private String name;
    private int ssn;
    private double salary;


    public Administrator(int empId, String name, int ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;

    }
    public void printAdministrador(){
        System.out.println(empId + name + ssn + salary);
    }
}
