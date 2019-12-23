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
import com.howtodoinjava.demo.repository.ManagerRepository;
 
@Service
public class ManagerService {
     
    @Autowired
   ManagerRepository repository;
    
    
    
   
    public List<Manager> getAllManager()
    {
        List<Manager> employeeList1 = repository.findAll();
         
        if(employeeList1.size() > 0) {
            return employeeList1;
        } else {
            return new ArrayList<Manager>();
        }
    }
     
    
    
    public Manager createOrUpdateEmployee1(Manager entity) throws RecordNotFoundException
    {
        /*Optional<Project> employee = repository.findById(entity.getId());*/


 Optional<Manager> employee1 = null;
	
    	
        if(employee1.isPresent())
        {
        	Manager	 newEntity = employee1.get();

        	  newEntity.setManagername(entity.getManagername());
              
              
          
     
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    }
}
		
    
    