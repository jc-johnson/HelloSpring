package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

/**
 * Created by jjohnson on 5/26/2016.
 */
public class CustomEvent extends ApplicationEvent{

    public CustomEvent(Object source){
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }

}
