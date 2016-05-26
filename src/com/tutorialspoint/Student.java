package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jjohnson on 5/26/2016.
 */
public class Student {
    private Integer age;
    private String name;

    @Autowired(required=false)
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge(){
        return age;
    }

    @Autowired
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
