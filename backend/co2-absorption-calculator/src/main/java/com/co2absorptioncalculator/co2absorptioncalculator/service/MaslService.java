package com.co2absorptioncalculator.co2absorptioncalculator.service;

import com.co2absorptioncalculator.co2absorptioncalculator.document.Masl;
import com.co2absorptioncalculator.co2absorptioncalculator.repository.MaslRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaslService extends MongoService<Masl> {

    public MaslService(MaslRepository maslRepository) {
        super(maslRepository);
    }

}
