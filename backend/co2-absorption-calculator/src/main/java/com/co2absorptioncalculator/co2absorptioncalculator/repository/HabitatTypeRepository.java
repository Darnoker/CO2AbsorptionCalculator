package com.co2absorptioncalculator.co2absorptioncalculator.repository;

import com.co2absorptioncalculator.co2absorptioncalculator.document.HabitatType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitatTypeRepository extends MongoRepository<HabitatType, String> {

}
