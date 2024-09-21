package com.example.javacassandratutorialV01;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    @Autowired
    private GreetingRepository greetingRepository;

    //Get all greetings
    @GetMapping
    public List<Greeting> getAllGreetings(){
        return greetingRepository.findAll();

    }
    
     // Create a new greeting
    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    // Get a greeting by ID
    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable UUID id) {
        return greetingRepository.findById(id).orElse(null);
    }

    // Hello endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from the REST Controller!";
    }
    
}
