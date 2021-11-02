package ru.eshmakar.springboot_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eshmakar.springboot_data_rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
