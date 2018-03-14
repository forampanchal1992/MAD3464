/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a new object of Bank Class
        
        Bank myBank = new Bank();
        System.out.println("Bank Id is " + myBank.bankID);
        System.out.println("Bank Name is " + myBank.bankName);
        
        Bank yourBank = new Bank();
        myBank.bankID = 101;
        myBank.bankName = "Scotia";
        
        System.out.println("Bank Id is " + myBank.bankID);
        System.out.println("Bank Name is " + myBank.bankName);
        
        myBank.getBankName();
        yourBank.setBankName("ICICI");
        yourBank.getBankName();
        
        //myBank.setBankName("BMO");
        //myBank.getBankName();
        
        Scanner myInput = new Scanner(System.in);
        String name;
        System.out.println("Enter Bank NAme: ");
        name = myInput.nextLine();
        
        yourBank.setBankName(name);
        yourBank.getBankName();
        
        //Object of Addition
        Arithmetic op1 = new Arithmetic();
        //op1.addition(10, 20);
        
        System.out.println("Addition of number : " + op1.addition(10, 20));
        System.out.println("Addition of number : " + op1.addition(10.20f, 20.01f));
        System.out.println("Addition of number : " + op1.addition(10, 20, 30));
        System.out.println("Output of multiplication : " + op1.multiplication(10, 20, 30));
        
        Arithmetic.multiplication(10,40);
     
        Arithmetic.n1 = 20;
       // Arithmetic.n2 = 40;
        System.out.println(Arithmetic.n1 + " " + Arithmetic.n2);
    }
    
}
