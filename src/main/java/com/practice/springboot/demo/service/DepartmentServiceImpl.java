package com.practice.springboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.springboot.demo.entity.Department;
import com.practice.springboot.demo.repository.DepartmentDAO;

import error.DepartmentNotFoundException;
import lombok.Data;

@Component
@Data
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDao;

	public Department saveDepartment(Department department){
		return departmentDao.save(department);
	}

	
	public List<Department> fetchDepartmentList() {
		return departmentDao.findAll();
	}


	public Department fetchDepartmentById(long id) throws DepartmentNotFoundException {
		Optional<Department> dept = departmentDao.findById(id);
		if(!dept.isPresent())
			throw new DepartmentNotFoundException("department not found");
		else
			return departmentDao.findById(id).get();
	}

	
	public String deleteDepartmentById(long id) {
		departmentDao.deleteById(id);
		return "Department with id " + id+ " deleted succesfully!!" ;
	}
	
	
	public Department updateDepartment(long id, Department department) {
		Department dept = departmentDao.findById(id).get();
		dept.setDeptName(department.getDeptName());
		dept.setDeptAddr(department.getDeptAddr());
		dept.setDeptCode(department.getDeptCode());
		return departmentDao.save(dept);
	}
	
	
	public Department getDepartmentByName(String dName) {
		return departmentDao.findByDeptName(dName);
	}

}
