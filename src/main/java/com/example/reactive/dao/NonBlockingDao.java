package com.example.reactive.dao;

import com.example.reactive.model.Employee;
import com.example.reactive.util.data.CommonDataSource;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class NonBlockingDao implements IDao<Flux<Employee>, Mono<Employee>> {

    @Override
    public Flux<Employee> fetchAll() {
        return Flux.fromStream(CommonDataSource.getEmployees());
    }

    @Override
    public Mono<Employee> fetObject(String id) {
        return Mono.just(CommonDataSource.getEmployeeObject(id));
    }


}
