package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.Manager;
import com.howtodoinjava.demo.model.Project;
import com.howtodoinjava.demo.repository.ProjectRepository;

import java.util.List;
import java.util.Optional;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.Project;
import com.howtodoinjava.demo.repository.ProjectRepository;
 
@Service
public class EmployeeService {
     
    @Autowired
   ProjectRepository repository;
    
  
   
   
  
    
    @JoinTable(name="project",joinColumns = {@JoinColumn(name="id")},inverseJoinColumns = @JoinColumn(name = "project_type"))
    public List<Project> getAllEmployees()
    {
        List<Project> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Project>();
        }
    }
     
    public Project getEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<Project> employee = repository.findById(id);
        
        
        
       
         
        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
    
 
    public Project getEmployeeByID(String id) {
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Project();
		
	}

    
    
    
    
    
    
    
    
    
    
    
    
     
    public Project createOrUpdateEmployee(Project entity) throws RecordNotFoundException
    {
        /*Optional<Project> employee = repository.findById(entity.getId());*/


 Optional<Project> employee = null;
	
    	
        if(employee.isPresent())
        {
        	Project newEntity = employee.get();

        	  newEntity.setName(entity.getName());
              newEntity.setDescription(entity.getDescription());
              
              
             newEntity.setProjecttype(entity.getProjecttype());
             newEntity.setAssociatetechnology(entity.getAssociatetechnology());
     
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
		
    }
    
    
    
    
    
    
    
   
    
    
    
    
    
    
     
    public void deleteEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<Project> employee = repository.findById(id);
         
        if(employee.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
}