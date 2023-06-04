package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Degree;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.DegreeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeService extends MongoService<Degree> {

    public DegreeService(DegreeRepository degreeRepository) {
        super(degreeRepository);
    }
}
