package com.devsuperior.demolazy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demolazy.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
