package com.co2absorptioncalculator.co2absorptioncalculator.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "averageAge")
public class AverageAge {

    @Id
    private String id;
    private String ageInterval;

    public AverageAge(String ageInterval) {
        this.ageInterval = ageInterval;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAgeInterval() {
        return ageInterval;
    }

    public void setAgeInterval(String ageInterval) {
        this.ageInterval = ageInterval;
    }
}
