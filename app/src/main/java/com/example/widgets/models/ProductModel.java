package com.example.widgets.models;

import androidx.annotation.NonNull;

public class ProductModel {
    private String name;
    private String description;

    public ProductModel(String Name,String Description) {
        this.name = Name;
        this.description = Description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return name + " "+description;
    }
}
