package com.co2absorptioncalculator.co2absorptioncalculator.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "habitat")
public class HabitatType {

    @Id
    private String id;
    private String name;
    private String latinName;
    private String polishName;

    public HabitatType() {
    }

    public HabitatType(String name, String latinName, String polishName) {
        this.name = name;
        this.latinName = latinName;
        this.polishName = polishName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getPolishName() {
        return polishName;
    }

    public void setPolishName(String polishName) {
        this.polishName = polishName;
    }

    @Override
    public String toString() {
        return "HabitatType{" +
                ", name='" + name + '\'' +
                ", latinName='" + latinName + '\'' +
                ", polishName='" + polishName + '\'' +
                "}\n";
    }
}
