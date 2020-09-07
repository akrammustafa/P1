//In this assignment, we have created a simple company system and each class
// has a different task, helping to organize the data that is linked in connection with each other.
package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

//Student Name: Akram Mohammed A MUSTAFA
//Student Number: 150116905
public class Test {

    private static Object ArrayList;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //The Files.lines method allows read a file line by line

        FileWriter writer = new FileWriter("output.txt");
        File file = new File("C:\\Users\\Dj_MG\\IdeaProjects\\HomeWork1\\input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] lines = line.split(" ");

            switch (lines[0]){
                case "Department":
                    Department department = new Department(Integer.parseInt(lines[1]), lines[2]);
                    writer.write(department.toString() + "\n");
                    break;
                case "Project":
                    String date = lines[2].substring(0,2);
                    String month = lines[2].substring(3,5);
                    String year = lines[2].substring(6,10);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(new Date(Integer.parseInt(year),Integer.parseInt(month), Integer.parseInt(date)));

                    Project project=new Project((lines[1]),cal,(lines[3]));
                    writer.write(project.toString() + "\n");
                    break;
                case "Person":
                 //   date =  lines[5].substring(0,2);
                   // month = lines[5].substring(3,5);
                     //year = lines[5].substring(6,10);
                     //cal = Calendar.getInstance();
                    //cal.setTime(new Date(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date)));
                    Person person=new Person(Integer.parseInt(lines[3]),(lines[2]),(lines[1]),(lines[4]),null,(lines[6]),(lines[7]));
                    writer.write(person.toString() + "\n");
                    break;
               case "Employee":
                 //  date = lines[3].substring(0,1);
                   // month = lines[3].substring(3,4);
                    //year = lines[3].substring(5,8);
                    //cal = Calendar.getInstance();
                   // cal.setTime(new Date(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date)));

                    Employee employee=new Employee(null,Double.parseDouble(lines[2]),null,null);
                    writer.write(employee.toString() + "\n");
                    break;
                case "RegularEmployee":
                    RegularEmployee regularEmployee=new RegularEmployee(null,Integer.parseInt(lines[2]));
                    writer.write(regularEmployee.toString() + "\n");
                    break;
                case "Developer":
                    Developer developer=new Developer(null,null);
                    writer.write(developer.toString() + "\n");
                    break;
                case "Manager":
                    Manager manager=new Manager(null,Integer.parseInt(lines[2]));
                    writer.write(manager.toString() + "\n");
                    break;
                case "SalesEmployee":
                    ArrayList<Product> products = new ArrayList<>();
                    Calendar ses=Calendar.getInstance();
                    ses.setTime(new Date(2020, Calendar.OCTOBER, 10));
                    products.add(new Product(lines[2],ses,100));
                    products.add(new Product(lines[3],ses,200));
                    
                    SalesEmployee salesEmployee=new SalesEmployee(null,products);
                    writer.write(salesEmployee.toString() + "\n");
                    break;
            }
        }

        writer.close();





        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(2018, Calendar.MAY, 1));
        Calendar cal1 = Calendar.getInstance();
        cal.setTime(new Date(2019, Calendar.JANUARY, 1));
        Calendar cal2 = Calendar.getInstance();
        cal.setTime(new Date(1986, Calendar.MAY, 5));
        Department department = new Department(1,"Accounting");
        Project project  = new Project("AutoCredit", cal, "Open");
        Product product  =  new Product("Product1",cal1,10000);
        Person person   =  new Person(111,"Ayse","Caliskan","woman",cal2,"married","yes");
        Calendar hireDate=Calendar.getInstance();
        cal.setTime(new Date(2017, Calendar.OCTOBER, 10));
        Employee   employee = new Employee(person,5000,hireDate,
                department);
        RegularEmployee regularEmployee = new RegularEmployee(employee,25);
        ArrayList<Project> projects = new ArrayList<>();
        Calendar pDate1=Calendar.getInstance();
        cal.setTime(new Date(2020, Calendar.OCTOBER, 10));
        Calendar pDate2=Calendar.getInstance();
        cal.setTime(new Date(2020, Calendar.OCTOBER, 10));
        projects.add(new Project("CreditCard",pDate1,"Open" ));
        projects.add(new Project("Robotics",pDate2,"Open"));
        Developer developer = new Developer(regularEmployee, projects);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Product1",pDate1,100));
        products.add(new Product("Product2",pDate2,200));
        products.add(new Product("Product5",pDate2,300));
        Customer customer = new Customer(person,products);
    }
}
