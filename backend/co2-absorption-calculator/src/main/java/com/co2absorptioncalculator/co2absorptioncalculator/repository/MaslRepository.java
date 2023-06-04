package com.co2absorptioncalculator.co2absorptioncalculator.repository;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Masl;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaslRepository extends MongoRepository<Masl, String> {
}
