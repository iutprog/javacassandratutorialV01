package com.example.javacassandratutorialV01;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface  GreetingRepository extends CassandraRepository<Greeting, UUID>{
    
}
