package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.SoilMoisture;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.SoilMoistureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoilMoistureService extends MongoService<SoilMoisture> {

    public SoilMoistureService(SoilMoistureRepository soilMoistureRepository) {
        super(soilMoistureRepository);
    }
}
