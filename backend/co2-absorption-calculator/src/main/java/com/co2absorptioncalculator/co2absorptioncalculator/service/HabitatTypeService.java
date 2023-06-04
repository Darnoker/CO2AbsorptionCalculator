package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.HabitatType;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.HabitatTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class HabitatTypeService extends MongoService<HabitatType>{

    public HabitatTypeService(HabitatTypeRepository habitatTypeRepository) {
        super(habitatTypeRepository);
    }
}
