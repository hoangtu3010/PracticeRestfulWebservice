package com.example.practicerestfulwebservice.repository;


import com.example.practicerestfulwebservice.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();
    Employee save(Employee product);
    Boolean update(Integer id, Employee product);
    Employee findById(Integer id);
}
