/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4arrayunittest;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Student {
    
    int studID;
    String name;
    int percentage;
    
    Student()
    {
        this.studID = 0;
        this.name = "Unknown";
        this.percentage = 0;
    }
    
    Student(int studID, String name, int percentage)
    {
        this.studID = studID;
        this.name = name;
        this.percentage = percentage;
    }
    
    void setId(int ID)
    {
        this.studID = ID;
    }
    
    int getId()
    {
        return this.studID;
    }
    
    void setTitle(String name)
    {
        this.name = name;
    }
    
    String getTitle()
    {
        return this.name;
    }
    
    void setRating(int percentage)
    {
        this.percentage =percentage;
    }
    int getRating()
    {
        return this.percentage;
    }
   
    void displayInfo()
    {
        System.out.println("BookId: " +this.studID+ "\n Book Title: " +this.name+ "\n Book Rating : " +this.percentage);
    }
    
    
}

class nameComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.name.compareToIgnoreCase(o1.name);
    }
    
}
    
class percentageComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.percentage == o2.percentage)
        {
            return 0;
        }
        else if(o1.percentage > o2.percentage)
            return 1;
        else 
            return -1;
    }
    
    
}
    

