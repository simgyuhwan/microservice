package com.example.event.model;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EventController {
    private final CustomEventPublisher customEventPublisher;

    @GetMapping("/event")
    public String event(@RequestParam String message){
        customEventPublisher.publish(message);
        return "finished";
    }
}
