package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by jjohnson on 5/26/2016.
 */
public class Profile {
    @Autowired
    @Qualifier("student1")  // created more than one bean at once
                            // want to specify which bean will be wired
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constuctor.");
    }

    public void printAge(){
        System.out.println("Age : " + student.getAge());
    }

    public void printName() {
        System.out.println("Name : " + student.getName());
    }

}
