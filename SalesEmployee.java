package com.company;

import java.util.ArrayList;
import java.util.Calendar;

public class SalesEmployee extends RegularEmployee {

    private  ArrayList <Product> sales;
    public static int numberOfSalesEmployees;

    public SalesEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
                         String hasDriverLicence, double salary, Calendar hireDate, Department department, double pScore, ArrayList<Product> s){
        // call the super class’s constructor
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence,salary,hireDate,department, pScore);
        numberOfSalesEmployees++;

    }

    public SalesEmployee(RegularEmployee re, ArrayList<Product> s){
        numberOfSalesEmployees++;
    //When you create a new SalesEmployee, you should increment numberOfSalesEmployees
        //value by 1.
    }
    public boolean addSale(Product s){

        return sales.add(s);
    }
    public boolean removeSale(Product s){
        return sales.remove(s);
    }

    //There are setter/getter and toString() methods.
    public ArrayList<Product> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Product> sales) {
        this.sales = sales;
    }

    public static int getNumberOfSalesEmployees() {
        return numberOfSalesEmployees;
    }

    public static void setNumberOfSalesEmployees(int numberOfSalesEmployees) {
        SalesEmployee.numberOfSalesEmployees = numberOfSalesEmployees;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "sales=" + sales + '}'+"NumberOfSalesEmployee"+numberOfSalesEmployees;
    }
}
