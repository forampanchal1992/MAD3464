/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author macstudent
 */
public class GenericsClass {
    
    public static void main(String[] args)
    {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        
        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello world"));
        
        System.out.printf("Integer value is :%d\n\n", integerBox.get());
        System.out.printf("String value is :%s\n\n", stringBox.get());
        
    }
}

class Box<T>
{
    private T t;
    public void add(T t)
    {
        this.t = t;
    }
    public T get(){
        return t;
    }
}
