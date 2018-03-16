/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4arrayunittest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class Day4ArrayUnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Books b1 = new Books(1,"The SKy",3);
        Books b2 = new Books(2,"Necklace",7);
        Books b3 = new Books(3,"Milk",9);
        Books b4 = new Books(4,"Journey",4);
        Books b5 = new Books(5,"Wonder",10);
        
        ArrayList<Books> library = new ArrayList<Books>();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.add(b5);
        
        System.out.println("No of books: " +library.size());
        
        //library.set(2,new Books(10,"PAcific",6));
        
        for(Books bk: library)
        {
            bk.displayInfo();
        }
        library.forEach(bk -> {
            bk.displayInfo();
        });
        
        
        Student student1 = new Student(1,"Akasy",78);
        Student student2 = new Student(2,"Nehal",73);
        Student student3 = new Student(3,"Behal",23);
        
        ArrayList<Student> stud = new ArrayList<Student>();
        stud.add(student1);
        stud.add(student2);
       stud.add(student3);
        
        System.out.println("No of Student: " +stud.size());
        
        
        for(Student bk: stud)
        {
            bk.displayInfo();
        }
        stud.forEach(bk -> {
            bk.displayInfo();
        });
        
        System.out.println("---------Title Comparator----------");
        Collections.sort(library,new bookTitleComparator());
        for(Books bk: library)
        {   
            bk.displayInfo();
        }
        
        System.out.println("---------Rating Comparator----------");
        Collections.sort(library, new bookRatingComparator());
        for(Books bk: library)
        {   
            bk.displayInfo();
        }
        
        System.out.println("---------ID Comparator----------");
        Collections.sort(library, new bookIDComparator());
        for(Books bk: library)
        {   
            bk.displayInfo();
        }
        
        System.out.println("------Student Name Comparator-------------");
        
        Collections.sort(stud, new nameComparator());
        for(Student sk: stud)
        {   
            sk.displayInfo();
        }
        
        System.out.println("------Student Percentage Comparator-------------");
        
        Collections.sort(stud, new percentageComparator());
        for(Student sk: stud)
        {   
            sk.displayInfo();
        }
    }
    
}
