package com.spring.criteria.service;

import com.spring.criteria.entity.Employee;
import com.spring.criteria.entity.Product;
import com.spring.criteria.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository bookRepository ;

    public EmployeeService(EmployeeRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void add(){

    }
    public void edit(){

    }
    public void delete(){

    }
    public void findOne(){

    }
    public List<Employee> findAll(){
        return bookRepository.findAll();
    }
}
