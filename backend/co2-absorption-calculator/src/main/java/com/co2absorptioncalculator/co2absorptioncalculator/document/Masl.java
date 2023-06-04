package com.co2absorptioncalculator.co2absorptioncalculator.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "masl")
public class Masl {

    @Id
    private String id;
    private String landForm;
    private String description;

    public Masl(String landForm, String description) {
        this.landForm = landForm;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLandForm() {
        return landForm;
    }

    public void setLandForm(String landForm) {
        this.landForm = landForm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
