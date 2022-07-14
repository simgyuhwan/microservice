package com.example.event.generic;

import com.example.event.model.CustomEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class GenericEventController {

    private final GenericEventPublisher<String> genericEventPublisher;

    @GetMapping("/event/generic")
    public String event(@RequestParam String message, @RequestParam boolean success){
        genericEventPublisher.publish(message, success);
        return "finished";
    }
}
