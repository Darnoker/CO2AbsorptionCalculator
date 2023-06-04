package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.AverageAge;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.AverageAgeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AverageAgeService extends MongoService<AverageAge> {

    public AverageAgeService(AverageAgeRepository averageAgeRepository) {
        super(averageAgeRepository);
    }

}
