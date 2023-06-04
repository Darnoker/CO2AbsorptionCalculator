package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.document.SoilMoisture;
import com.co2absorptioncalculator.co2absorptioncalculator.service.SoilMoistureService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/soilMoisture/")
@CrossOrigin
public class SoilMoistureController extends MongoController<SoilMoisture> {
    public SoilMoistureController(SoilMoistureService soilMoistureService) {
        super(soilMoistureService);
    }
}
