package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.DominantSpecies;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.DominantSpeciesRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class DominantSpeciesService extends MongoService<DominantSpecies> {
    public DominantSpeciesService(DominantSpeciesRepository dominantSpeciesRepository) {
        super(dominantSpeciesRepository);
    }
}
