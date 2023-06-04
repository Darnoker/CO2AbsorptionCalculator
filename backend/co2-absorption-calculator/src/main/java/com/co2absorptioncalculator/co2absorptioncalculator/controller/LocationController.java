package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Location;
import com.co2absorptioncalculator.co2absorptioncalculator.service.LocationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location/")
@CrossOrigin
public class LocationController extends MongoController<Location> {
    public LocationController(LocationService locationService) {
        super(locationService);
    }
}
