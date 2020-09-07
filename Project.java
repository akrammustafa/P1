package com.company;

import java.util.Calendar;

public class Project {
    private String projectName;
    private Calendar startDate;
    private boolean state;

    public Project(String pName,Calendar startDate,String state){
        this.projectName=pName;
        this.startDate=startDate;
        this.state = state.equals("Open");
    }
    //In close method, you should close the project if it is open.
    public void close(){
        state=false;
    }

    //There are setter/getter and toString() methods.
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public boolean IsState() {
        return state;
    }

    public void setState(String state) {
        this.state = state.equals("Open");
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", state=" + state +
                '}';
    }
}
