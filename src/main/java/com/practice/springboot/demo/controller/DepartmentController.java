package com.practice.springboot.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.demo.entity.Department;
import com.practice.springboot.demo.service.DepartmentService;

import error.DepartmentNotFoundException;
import jakarta.validation.Valid;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@PostMapping ("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department)
	{
		 LOGGER.info("inside saveDepartment of DepartmentController"); 
		 return departmentService.saveDepartment(department); 
	}
	
	@GetMapping("/departments")
	public List<Department> fecthDepartmentList()	{
		LOGGER.info("inside fetchDepartmentList of DepartmentController"); 
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
		LOGGER.info("inside fetchDepartmentById of DepartmentController"); 
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@GetMapping("/departments/delete/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("inside deleteDepartmentById of DepartmentController"); 
		departmentService.deleteDepartmentById(departmentId);
		return "Department with id " + departmentId+ " deleted succesfully!!" ;
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department) {
		LOGGER.info("inside updateDepartment of DepartmentController"); 
		return departmentService.updateDepartment(departmentId,department);
	}
	
	@GetMapping("/departments/name/{name}")
	public Department getDepartmentByName(@PathVariable("name") String dName) {
		LOGGER.info("inside getDepartmentByName of DepartmentController"); 
		return departmentService.getDepartmentByName(dName);
	}
}
