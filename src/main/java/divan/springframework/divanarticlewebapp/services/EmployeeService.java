package divan.springframework.divanarticlewebapp.services;

import divan.springframework.divanarticlewebapp.domain.Employee;
import divan.springframework.divanarticlewebapp.repositories.EmpolyeeRepository;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    Iterable<Employee> findAll();


}
