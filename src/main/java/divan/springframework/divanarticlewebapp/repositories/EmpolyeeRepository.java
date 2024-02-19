package divan.springframework.divanarticlewebapp.repositories;

import divan.springframework.divanarticlewebapp.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpolyeeRepository extends CrudRepository<Employee, Long> {
}
