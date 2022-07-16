package com.example.event.model;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener {

    @EventListener
    public void handleMessageStart(CustomEvent event){
        System.out.println("Received spring custom event - " + event.getMessage());
    }

    @Async
    @EventListener
    public void handleMessageSub(CustomEvent event){
        try {
            Thread.sleep(3000);
            System.out.println("Received spring sub event - " + event.getSubMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
