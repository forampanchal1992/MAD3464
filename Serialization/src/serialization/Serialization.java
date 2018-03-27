/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author macstudent
 */
public class Serialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e = new Employee();
        e.name = "foram";
        e.address = "Toronto";
        e.SSN = 2322323;
        e.number = 102;
        
        try
        {
            FileOutputStream fileout = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            
            out.writeObject(e);
            
            out.close();
            fileout.close();
            System.out.println("Seralized data is saved as employee");
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
    }
    
}
