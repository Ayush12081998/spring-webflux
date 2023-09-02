package com.example.reactive.web;

import com.example.reactive.model.Employee;
import com.example.reactive.service.NonBlockingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/non-blocking")
public class NonBlockingController {

    @Autowired
    private NonBlockingService nonBlockingService;

    @GetMapping
    public String checkResponse(){
        return "STATUS:OK";
    }

    @RequestMapping(value = "/employees",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<Employee> getAllEmployees() {
        return this.nonBlockingService.getAllEmployees();
    }

    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Mono<Employee> getAllEmployees(@PathVariable String employeeId) {
        return this.nonBlockingService.getEmployee(employeeId);
    }

}
