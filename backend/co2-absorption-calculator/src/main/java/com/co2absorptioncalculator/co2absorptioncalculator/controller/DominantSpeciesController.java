package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.document.DominantSpecies;
import com.co2absorptioncalculator.co2absorptioncalculator.service.DominantSpeciesService;
import com.co2absorptioncalculator.co2absorptioncalculator.service.MongoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dominantSpecies/")
@CrossOrigin
public class DominantSpeciesController  extends MongoController<DominantSpecies> {
    public DominantSpeciesController(DominantSpeciesService dominantSpeciesService) {
        super(dominantSpeciesService);
    }
}
