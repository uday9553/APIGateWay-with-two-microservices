package com.uday.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("getAll")
	public List<Employee> getAll(){
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"Uday"));
		empList.add(new Employee(2,"Sagar"));
		return empList;
	}

}
