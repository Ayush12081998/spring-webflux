package com.example.reactive.dao;

public interface IDao<T,U> {

    T fetchAll();

    U fetObject(String id);
}
