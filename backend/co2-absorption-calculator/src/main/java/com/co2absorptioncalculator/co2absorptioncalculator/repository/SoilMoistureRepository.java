package com.co2absorptioncalculator.co2absorptioncalculator.repository;

import com.co2absorptioncalculator.co2absorptioncalculator.document.SoilMoisture;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SoilMoistureRepository extends MongoRepository<SoilMoisture, String> {
}
