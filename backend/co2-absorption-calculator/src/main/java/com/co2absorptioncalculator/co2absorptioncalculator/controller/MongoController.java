package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.service.MongoService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public abstract class MongoController<T> {

    private MongoService<T> mongoService;

    public MongoController(MongoService<T> mongoService) {
        this.mongoService = mongoService;
    }

    @GetMapping("/all")
    public List<T> getAll() {
        return mongoService.getAll();
    }
}
