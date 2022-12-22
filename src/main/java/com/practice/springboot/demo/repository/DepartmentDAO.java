package com.practice.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.springboot.demo.entity.Department;

@Repository
public interface DepartmentDAO extends JpaRepository<Department,Long>{
	
	public Department findByDeptName(String deptName);

}
