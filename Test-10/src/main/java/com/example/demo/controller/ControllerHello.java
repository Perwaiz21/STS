package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;


@RestController
public class ControllerHello {
 
	@RequestMapping("/hello")
	public String test() {
		return "Hello";
	}
	


   @Autowired
    private EmployeeRepository employeeRepository;

    //@PostMapping("/employee")
    @RequestMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @RequestMapping("/")
	public String healthCheck() {
		return "Hello";
	}
	

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") String employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") String employeeId) {
        return  employeeRepository.delete(employeeId);
    }

    @PutMapping("/employee/{id}")
    public String updateEmployee(@PathVariable("id") String employeeId, @RequestBody Employee employee) {
        return employeeRepository.update(employeeId,employee);
    }

	
	
}