package com.department.controller;

import com.department.entity.Department;
import com.department.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	public Department saveDepartment(Department department)
	{
		return department;

	}
}
