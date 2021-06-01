package com.uday.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.model.Person;

@RestController
@RequestMapping("/person")
public class EmployeeController {
	
	@GetMapping("getAll")
	public List<Person> getAll(){
		List<Person> empList=new ArrayList<>();
		empList.add(new Person(3,"chinna"));
		empList.add(new Person(4,"umesh"));
		return empList;
	}

}