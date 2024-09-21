package com.example.javacassandratutorialV01;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Table("greetings")
public class Greeting {

    @PrimaryKey
    private UUID id;

    private String message;

    public Greeting() {
        this.id = UUID.randomUUID();
    }

    public Greeting(String message) {
        this.id = UUID.randomUUID();
        this.message = message;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

