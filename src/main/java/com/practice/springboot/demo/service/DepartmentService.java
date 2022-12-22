package com.practice.springboot.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.springboot.demo.entity.Department;

import error.DepartmentNotFoundException;

@Component
public interface DepartmentService {
	
	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();
	
	public Department fetchDepartmentById(long id) throws DepartmentNotFoundException ;
	
	public String deleteDepartmentById(long id);
	
	public Department updateDepartment(long id,Department department);

	public Department getDepartmentByName(String dName);

}
