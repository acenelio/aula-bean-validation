package com.devsuperior.demolazy.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.demolazy.dto.EmployeeDTO;
import com.devsuperior.demolazy.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> findAll() {
		List<EmployeeDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<EmployeeDTO> insert(@RequestBody EmployeeDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
