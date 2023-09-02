package com.example.reactive.util.data;

import com.example.reactive.model.Employee;

import java.util.stream.Stream;

public class CommonDataSource {

    private CommonDataSource() {
        throw new IllegalStateException("Utility Class !!!");
    }

    public static Stream<Employee> getEmployees() {
        return Stream.of(
                new Employee("1", "Ayush Kumar", "CFT", 10000d),
                new Employee("2", "Papa Kumar", "CFT", 10001d),
                new Employee("3", "Chacha Kumar", "CFT", 10002d),
                new Employee("4", "Dada Kumar", "CFT", 10003d),
                new Employee("5", "Fufa Kumar", "CFT", 10004d)
        );
    }

    public static Employee getEmployeeObject(String employeeId) {
        return new Employee(employeeId, "name", "department", 100d);
    }
}
