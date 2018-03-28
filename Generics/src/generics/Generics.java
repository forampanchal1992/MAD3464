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
public class Generics {

    public static <E> void printArray(E[] inputArray)
    {
        for(E element: inputArray)
        {
            System.out.printf("%s",element);
        }
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'F','P','A','R','M'};
        
        System.out.println("\nArray integrerArray contains:");
        printArray(intArray); // pass an Integer array
        
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray); // pass double array
        
        System.out.println("\nArray characterArray contains:");
        printArray(charArray); // pass a character array
        
        
    }
    
}
