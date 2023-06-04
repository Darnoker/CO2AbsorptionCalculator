package com.co2absorptioncalculator.co2absorptioncalculator.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dominantSpecies")
public class DominantSpecies {

    @Id
    private String id;
    private String species;

    public DominantSpecies(String species) {
        this.species = species;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
