package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Location;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.LocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService extends MongoService<Location> {
    public LocationService(LocationRepository locationRepository) {
        super(locationRepository);
    }
}
