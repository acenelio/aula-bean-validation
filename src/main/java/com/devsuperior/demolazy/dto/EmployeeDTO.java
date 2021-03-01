package com.devsuperior.demolazy.dto;

import java.time.LocalDate;

import com.devsuperior.demolazy.entities.Employee;

public class EmployeeDTO {

	private Long id;
	private String name;
	private LocalDate birthDate;
	private Double salary;
	
	public EmployeeDTO() {
	}

	public EmployeeDTO(Long id, String name, LocalDate birthDate, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public EmployeeDTO(Employee entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.birthDate = entity.getBirthDate();
		this.salary = entity.getSalary();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
