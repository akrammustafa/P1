package com.company;

import java.util.Calendar;
//Employee is the superclass of RegularEmployee
public class RegularEmployee extends Employee {
    private double performanceScore;
    private double bonus;

    public RegularEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department,double performanceScore){
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence,salary,hireDate,department);
        this.performanceScore=performanceScore;
        // call the super class’s constructor
    }

    public RegularEmployee(Employee employee,double perfScore) {
        this.performanceScore=perfScore;
    }

    public RegularEmployee(){

    }

    //There are setter/getter and toString() methods.
    public double getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(double performanceScore) {
        this.performanceScore = performanceScore;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "performanceScore=" + performanceScore +
                ", bonus=" + bonus +
                '}';
    }
}
