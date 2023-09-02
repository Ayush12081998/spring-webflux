package com.example.reactive.dao;

import com.example.reactive.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlockingDao implements IDao<List<Employee>, Employee> {

    @Override
    public List<Employee> fetchAll() {
        return null;
    }

    @Override
    public Employee fetObject(String id) {
        return null;
    }

}
