/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author macstudent
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person one = new Person();
       
        //one.displayData();
    
    Person f1 = new Person("Foram", "Panchal", 21);
    //f1.displayData();
    
    Person f2 = new Person(f1);
    //f2.displayData();
    
    
//    EMployee e1 = new EMployee(1425.00);
//    e1.display();
    
    EMployee e2 = new EMployee();
     e2.display();
     e2.firstName="FP";
     e2.lastName="FP";
     e2.age=21;
     e2.salary=1000;
     //e2.displayData();
     e2.display();
     
    //Method Overriding
     EMployee e3 = new EMployee();
     e3.read();
     e3.display();
     
     
    
    
    }
    
    
    
}
