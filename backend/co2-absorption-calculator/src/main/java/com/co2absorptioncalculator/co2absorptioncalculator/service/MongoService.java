package com.co2absorptioncalculator.co2absorptioncalculator.service;

import java.util.List;

public interface MongoService<T> {

    public T save(T object);

    public List<T> getAll();
}
