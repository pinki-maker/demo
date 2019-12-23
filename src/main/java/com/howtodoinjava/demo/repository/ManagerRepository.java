package com.howtodoinjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.howtodoinjava.demo.model.Manager;

 
@Repository
public interface ManagerRepository
        extends JpaRepository<Manager, Long> {
 
}
