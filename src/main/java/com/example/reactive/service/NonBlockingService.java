package com.example.reactive.service;

import com.example.reactive.dao.NonBlockingDao;
import com.example.reactive.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class NonBlockingService {

    @Autowired
    private NonBlockingDao nonBlockingDao;

    public Flux<Employee> getAllEmployees(){
        return this.nonBlockingDao.fetchAll()
                .delayElements(Duration.ofSeconds(1));
    }

    public Mono<Employee>getEmployee(String employeeId){
        return this.nonBlockingDao.fetObject(employeeId)
                .delayElement(Duration.ofSeconds(2));
    }

}
