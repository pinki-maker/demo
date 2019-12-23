package com.howtodoinjava.demo.web;

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
import com.howtodoinjava.demo.model.Manager;




import com.howtodoinjava.demo.repository.ManagerRepository;
import com.howtodoinjava.demo.service.ManagerService;

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
@RequestMapping("/manager")
public class ManagerController
{
	

	  @Autowired
	    ManagerService service;
	
 
    @GetMapping
    public ResponseEntity<List<Manager>> getAllManager() {

		List<Manager> list = service.getAllManager();
 
        return new ResponseEntity<List<Manager>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    

   


   
}
 
 

    
	
 


















