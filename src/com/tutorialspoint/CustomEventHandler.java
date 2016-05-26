package com.tutorialspoint;

import org.springframework.context.ApplicationListener;

/**
 * Created by jjohnson on 5/26/2016.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent>{

    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
