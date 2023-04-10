package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.document.HabitatType;
import com.co2absorptioncalculator.co2absorptioncalculator.service.HabitatTypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/habitat")
@CrossOrigin
public class HabitatTypeController {

    private HabitatTypeService habitatTypeService;

    public HabitatTypeController(HabitatTypeService habitatTypeService) {
        this.habitatTypeService = habitatTypeService;
    }

    @GetMapping("/all")
    public List<HabitatType> getAll() {
        return habitatTypeService.getAll();
    }
}
