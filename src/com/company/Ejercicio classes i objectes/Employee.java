package com.company;

/**
 * Crea la clase Employee con los atributos empId, name, SSN y salary.
 * solo necesitamos definir el nombre y incremetar su sueldo:
 * crea los metodes que necesarios para llevar a cabo estas operaciones **/

public class Employee {

    private int empId;
    private String name;
    private int ssn;
    private double salary;

    public Employee(int empId, String name, int ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getName(String name){ return name; }
    public double getSalary(double salary){ return salary; }

    public void setName(String name){ this.name = name; }
    public void setSalary(double salary){ this.salary = salary; }

}
