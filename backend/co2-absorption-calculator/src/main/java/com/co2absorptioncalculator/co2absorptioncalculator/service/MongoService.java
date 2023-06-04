package com.co2absorptioncalculator.co2absorptioncalculator.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public abstract class MongoService<T> {

    private MongoRepository<T, String> repository;

    public MongoService(MongoRepository<T, String> repository) {
        this.repository = repository;
    }

    public T save(T document) {
        return repository.save(document);
    }

    public List<T> getAll() {
        return repository.findAll();
    }
}
