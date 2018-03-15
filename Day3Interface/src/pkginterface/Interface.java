/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author macstudent
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Addition op1 = new Addition();
        op1.display();
        Counting c1 = new Counting();
        c1.display();
        
//        A a1 = new A();
//        a1.display();
//        a1.calcMultiplication();
        
        B b1 = new B();
        b1.display();
        b1.calcMultiplication();
        b1.calcDivision();
        
        C c2 = new C();
        c2.display();
        c2.calcMultiplication();
        c2.calcDivision();
    }
    
}
interface Arithmetic
{
    int n1=10,n2=10;
    
    void display();
    
}
class Addition implements Arithmetic
{
//    int n1=20,n2=90;
    @Override
    public void display() {
      System.out.println(n1 + " + " + n2 + " =" + (n1+n2));
        System.out.println("Inside Addition");
    }
    
}
class Counting extends Addition
{
    
}

interface multiplication extends Arithmetic
{
    void calcMultiplication();
}
class A implements multiplication
{
    @Override
   public void display()
    {
        System.out.println("n1 = " + n1 +" n2 = "+ n2);
    }
    @Override
   public void calcMultiplication()
    {
        System.out.println("Multiplication " +(n1*n2));
    }
}
interface division extends Arithmetic
{
    void calcDivision();
}

class B extends Addition implements division,multiplication
{
    @Override
   public void calcDivision()
    {
        System.out.println("Division " +(n1/n2));
    }
   @Override
   public void display()
    {
        System.out.println("Inside Class B");
        System.out.println("n1 = " + n1 +" n2 = "+ n2);
    }
   @Override
   public void calcMultiplication()
    {
        System.out.println("Multiplication " +(n1*n2));
    }
}

class C extends B
{
    int c1 = 20;
    @Override
   public void display()
    {
        System.out.println("Inside Class C");
        System.out.println("n1 = " + n1 +" n2 = "+ n2 + " c1 = "+ c1);
    }
}