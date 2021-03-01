package com.devsuperior.demolazy.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.demolazy.dto.EmployeeDTO;
import com.devsuperior.demolazy.entities.Employee;
import com.devsuperior.demolazy.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public List<EmployeeDTO> findAll() {
		List<Employee> list = repository.findAll();
		return list.stream().map(x -> new EmployeeDTO(x)).collect(Collectors.toList());
	}
	
	public EmployeeDTO insert(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setName(dto.getName());
		entity = repository.save(entity);
		return new EmployeeDTO(entity);
	}
}
