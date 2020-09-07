package com.company;

import java.util.Calendar;

public class Employee extends Person {
    private double salary;
    private Calendar hireDate;
    private int numberofEmployees;
    private Department department;

    public Employee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence,double salary,Calendar hireDate,Department department){

    }
    public Employee() {
    }

    public Employee(Person person, double salary, Calendar hireDate, Department department) {

        this.salary = salary;
        this.hireDate = hireDate;
        this.department = department;
    }
    public double raiseSalary(double percent){
        if (0 <= percent && percent <= 1) {
            salary += salary * percent;
        }
        return salary;
    }
    //raise the salary of the employee
    public int raiseSalary(int amount){
        salary += amount;
        return (int)salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Calendar getHireDate() {
        return hireDate;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }

    public int getNumberofEmployees() {
        return numberofEmployees;
    }

    public void setNumberofEmployees(int numberofEmployees) {
        this.numberofEmployees = numberofEmployees;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hireDate=" + hireDate +
                ", numberofEmployees=" + numberofEmployees +
                ", department=" + department +
                '}';
    }
}
