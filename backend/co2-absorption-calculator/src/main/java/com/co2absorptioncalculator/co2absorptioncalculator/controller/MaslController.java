package com.co2absorptioncalculator.co2absorptioncalculator.controller;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Masl;
import com.co2absorptioncalculator.co2absorptioncalculator.service.MaslService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/masl/")
@CrossOrigin
public class MaslController extends MongoController<Masl> {

    public MaslController(MaslService maslService) {
        super(maslService);
    }
}
