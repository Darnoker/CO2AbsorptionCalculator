package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Degree;
import com.co2absorptioncalculator.co2absorptioncalculator.service.DegreeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/degree")
@CrossOrigin
public class DegreeController extends MongoController<Degree> {

    public DegreeController(DegreeService degreeService) {
        super(degreeService);
    }
}
