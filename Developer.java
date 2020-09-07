package com.company;

import java.util.ArrayList;
import java.util.Calendar;

public class Developer extends RegularEmployee {
    private ArrayList<Project>projects;
    int numberOfDevelopers;

    public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence, double salary, Calendar hireDate, Department department, double pScore, ArrayList<Product>p){
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence,salary,hireDate,department,pScore);
        this.numberOfDevelopers=getNumberOfDevelopers();
        this.projects=getProjects();



    }
    public Developer(RegularEmployee re, ArrayList<Project> p ){


    }
    //In addProject method, you should add the given Projects s
    // to the list of projects.
    public boolean addProject(Project s){
    return projects.add(s);
    }
    //In removeProject method, you should remove
    //the given Product s from the list of projects
    public boolean removeProject(Product s){
    return projects.remove(s);
    }

    //There are setter/getter and toString() methods.
    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public int getNumberOfDevelopers() {
        return numberOfDevelopers;
    }

    public void setNumberOfDevelopers(int numberOfDevelopers) {
        this.numberOfDevelopers = numberOfDevelopers;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "projects=" + projects +
                ", numberOfDevelopers=" + numberOfDevelopers +
                '}';
    }
}
