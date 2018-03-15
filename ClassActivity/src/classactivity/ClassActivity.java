/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Person p = new Person();
//        p.readData();
//        p.displayData();
//        
//        Employee e = new Employee();
//        e.readValues();
//        e.displayValues();

        Faculty f = new Faculty();
        f.readData();
        f.displayData();
        f.readValues();
        f.displayValues();
        f.setData();
        f.getData();
    }
    
}
interface Person
{
//    String name ="Foram";
//    int age = 21;
    void readData();
    void displayData();
}

interface Employee
{
//    String type = "fulltime";
//    double salary = 2330.08;
    void readValues();
    void displayValues();
    
}
class Faculty implements Person,Employee
{
    String name;
    int age;
    
    String type;
    double salary;
    
    String course;
    
    
    public void readData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        this.name= input.nextLine();
        
        System.out.println("Enter Age:");
        this.age = input.nextInt();
    }
    
    public void displayData()
    {
        System.out.println("Name is : " +this.name);
        System.out.println("Age is : " +this.age);
    }
    public void readValues()
    {  
        Scanner input = new Scanner(System.in);
        System.out.println("Type of Job:");
        this.type = input.nextLine();
        
        System.out.println("Salary: ");
        this.salary = input.nextDouble();
    }
    public void displayValues()
    {
        System.out.println("Type for job : " +this.type);
        System.out.println("Salary is : " +this.salary);
    }
    public void setData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Course:");
        this.course = input.nextLine();
    }
    
    public void getData()
    {
        System.out.println("Course is : " +course);
    }
}

