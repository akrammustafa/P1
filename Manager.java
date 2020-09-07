package com.company;

import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
    private ArrayList<RegularEmployee> regularEmployees;
    private double bonusBudget;

    public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department, double bonusBudget) {
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence, salary, hireDate, department);
        this.bonusBudget = bonusBudget;
        //call the super class’s constructor
    }

    public Manager(Employee employee, double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }


    public void addEmployee(RegularEmployee e) {
        regularEmployees.add(e);
    }

    public void removeEmployee(RegularEmployee e) {
        regularEmployees.remove(e);
    }

    public void distributeBonusBudget() {
        double sum_salary_perf = 0;
        for (RegularEmployee e : regularEmployees) {
            sum_salary_perf += e.getSalary() * e.getPerformanceScore();
        }

        double unit = bonusBudget / sum_salary_perf;
        for (RegularEmployee e : regularEmployees) {
            e.setBonus(unit * e.getSalary() * e.getPerformanceScore());
        }
    }

    //There are setter/getter and toString() methods.
    public ArrayList<RegularEmployee> getRegularEmployees() {
        return regularEmployees;
    }

    public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
        this.regularEmployees = regularEmployees;
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "regularEmployees=" + regularEmployees +
                ", bonusBudget=" + bonusBudget +
                '}';
    }
}
