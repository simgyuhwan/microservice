package com.example.event.model;

import org.springframework.context.ApplicationEvent;

public class CustomEvent {
    private String message;
    private String subMessage = "subMessage";

    public CustomEvent(Object source, String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public String getSubMessage(){
        return subMessage;
    }
}
