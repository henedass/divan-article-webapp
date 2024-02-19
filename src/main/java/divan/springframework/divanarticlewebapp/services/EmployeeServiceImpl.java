package divan.springframework.divanarticlewebapp.services;

import divan.springframework.divanarticlewebapp.domain.Employee;
import divan.springframework.divanarticlewebapp.repositories.EmpolyeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmpolyeeRepository empolyeeRepository;

    public EmployeeServiceImpl(EmpolyeeRepository empolyeeRepository) {
        this.empolyeeRepository = empolyeeRepository;
    }

    @Override
    public Iterable<Employee> findAll() {
        return empolyeeRepository.findAll();
    }
}
