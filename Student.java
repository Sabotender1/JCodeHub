/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class contains the student object.
 * It consists of Student ID, First Name, Last Name, 
 * and the Semester that the student was added (ex: Spring 2015)
 * @author Jonathan
 */
public class Student {
    
    final private int  id;
    final private String firstName;
    final private String lastName;
    final private String semesterAdded;
    final private int yearAdded;
    
    public Student(int sId, String fName, String lName, String semester, int year)
    {
        id = sId;
        firstName = fName;
        lastName = lName;
        semesterAdded = semester;
        yearAdded = year;
    }
            
    
    public int getStudentId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getSemesterAdded()
    {
        return semesterAdded;
    }
    
    public int getYearAdded()
    {
        return yearAdded;
    }
}
