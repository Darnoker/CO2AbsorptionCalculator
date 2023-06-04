package com.co2absorptioncalculator.co2absorptioncalculator.repository;

import com.co2absorptioncalculator.co2absorptioncalculator.document.AverageAge;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AverageAgeRepository extends MongoRepository<AverageAge, String> {
}
