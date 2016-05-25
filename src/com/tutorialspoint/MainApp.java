package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jjohnson on 5/24/2016.
 */
public class MainApp {
    public static void main(String[] args) {
        // loads bean configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
    }

}

