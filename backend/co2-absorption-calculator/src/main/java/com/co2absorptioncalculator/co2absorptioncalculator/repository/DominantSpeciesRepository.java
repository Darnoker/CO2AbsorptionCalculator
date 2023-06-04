package com.co2absorptioncalculator.co2absorptioncalculator.repository;

import com.co2absorptioncalculator.co2absorptioncalculator.document.DominantSpecies;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DominantSpeciesRepository extends MongoRepository<DominantSpecies, String> {
}
