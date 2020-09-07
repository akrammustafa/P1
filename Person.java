package com.company;

import java.util.Calendar;
//Person is the superclass of
// Customer and Employee classe
public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private byte gender;
    private Calendar birthday;
    private byte maritalStatus;
    private boolean hasDriverLicence;

    public Person(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthDate;
        setGender(gender);
        setMaritalStatus(maritalStatus);
        setHasDriverLicence(hasDriverLicence);
    }

    // Empty Constructor
    public Person() {
    }


    //There are setter/getter and toString() methods.
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // should set the gender as 1 or 2.
    public void setGender(String gender) {
        if(gender.equals("woman"))
            this.gender = 1;
        else if(gender.equals("man"))
            this.gender = 2;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public void setMaritalStatus(String status) {
        if(status.equals("single"))
            maritalStatus = 1;
        else if(status.equals("married"))
            maritalStatus = 2;
    }

    public void setHasDriverLicence(String info) {
        if(info.equals("yes"))
            hasDriverLicence = true;
        else if(info.equals("no"))
            hasDriverLicence = false;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        if(gender == 1)
            return "woman";
        else
            return "man";
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getMaritalStatus() {
        if(maritalStatus == 1)
            return "single";
        else
            return "married";
    }

    public String getHasDriverLicence() {
        if(hasDriverLicence)
            return "yes";
        else
            return "no";
    }

    @Override
    public String toString() {
        return "Id = " + id + ", firstName = " + firstName + ", lastName" + lastName+",gender ="+gender+" , birthDate = "+ birthday + ", maritalStatus = "+maritalStatus+" ,HasDriverLicence ="+hasDriverLicence+".";

    }
}
