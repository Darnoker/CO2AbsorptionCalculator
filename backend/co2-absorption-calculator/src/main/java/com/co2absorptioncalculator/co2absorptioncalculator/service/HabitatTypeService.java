package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.HabitatType;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.HabitatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitatTypeService implements MongoService<HabitatType>{

    private final HabitatTypeRepository  habitatTypeRepository;

    public HabitatTypeService(HabitatTypeRepository habitatTypeRepository) {
        this.habitatTypeRepository = habitatTypeRepository;
    }

    @Override
    public HabitatType save(HabitatType habitatType) {
        return habitatTypeRepository.save(habitatType);
    }

    @Override
    public List<HabitatType> getAll() {
        return habitatTypeRepository.findAll();
    }
}
