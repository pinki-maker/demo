package com.howtodoinjava.demo.web;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.Project;




import com.howtodoinjava.demo.repository.ProjectRepository;
import com.howtodoinjava.demo.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



 
@RestController
@RequestMapping("/employees")
public class ProjectController
{
	

	  @Autowired
	    EmployeeService service;
	
 
    @GetMapping
    public ResponseEntity<List<Project>> getAllEmployees() {

		List<Project> list = service.getAllEmployees();
 
        return new ResponseEntity<List<Project>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{Id}")
    public ResponseEntity<Project> getEmployeeById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
    
		Project entity = service.getEmployeeById(id);
 
      return new ResponseEntity<Project>(entity, new HttpHeaders(), HttpStatus.OK);
      
    }
    
    @GetMapping("/Id/{Id}")
	public Project findStudentById(@PathVariable String id) {
		System.out.println("Searching by ID  : " + id);
		return new Project();
	}



   
    
 
    @PostMapping
    public ResponseEntity<Project> createOrUpdateEmployee(Project employee)
                                                    throws RecordNotFoundException {
    	Project updated = service.createOrUpdateEmployee(employee);
        return new ResponseEntity<Project>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
        service.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }
    
	
 
}