/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author macstudent
 */
public class Shape {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //MyShape obj1 = new MyShape();
        Circle c = new Circle();
        c.draw();
        c.display("Its circle");
        
                
        
    }
    
}

abstract class MyShape
{
    int x;
    int y;
    abstract void draw();
      
    void display(String message)
    {
        System.out.println(message);
    }
}

class Circle extends MyShape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Circle");
        super.x = 20;
        super.y = 30;
        System.out.println("x = " + super.x + " y = " +super.y);
        
    }
}

abstract class Rectangle extends MyShape
{
    int h;
    abstract void draw();
    
}