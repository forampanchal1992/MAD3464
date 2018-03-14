/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class EMployee extends Person{
    
    double salary;
    
    EMployee()
    {
        super();
        this.salary = 14;
    }
    EMployee(String fname,String lname,int age,double pay)
    {   
        super(fname,lname,age);
        this.salary = pay;
    }
    
    void read()
    {
        super.read();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary");
        this.salary = input.nextDouble();
    }
    void display()
    {
        super.display();
        System.out.println("Salary " +this.salary);
    }
}
