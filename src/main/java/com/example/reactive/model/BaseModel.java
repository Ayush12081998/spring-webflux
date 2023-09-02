package com.example.reactive.model;

public abstract class BaseModel {

    private final String id;

    protected BaseModel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
