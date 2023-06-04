package com.co2absorptioncalculator.co2absorptioncalculator.repository;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {
}
