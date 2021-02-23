package com.devsuperior.demolazy.dto;

import com.devsuperior.demolazy.entities.Employee;

public class EmployeeDTO {

	private Long id;
	private String name;
	
	public EmployeeDTO() {
	}

	public EmployeeDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public EmployeeDTO(Employee entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
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
}
