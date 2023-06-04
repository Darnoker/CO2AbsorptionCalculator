package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.document.AverageAge;
import com.co2absorptioncalculator.co2absorptioncalculator.service.AverageAgeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/averageAge/")
@CrossOrigin
public class AverageAgeController extends MongoController<AverageAge> {
    public AverageAgeController(AverageAgeService averageAgeService) {
        super(averageAgeService);
    }
}
