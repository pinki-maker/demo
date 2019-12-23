package com.howtodoinjava.demo.model;



import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBLE125_EMPLOYEES")
@Access(value=AccessType.FIELD)
public class Project {

	 


	@Column(name = "id", unique = true, nullable = false)
	
	
	


	
	
	
	
	
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="name")
    private String name;
    
    @Column(name="description")
    private String description;
    
    @Column(name="projecttype")
    private String projecttype;
    
    @Column(name="associatetechnology")
    private String associatetechnology;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProjecttype() {
		return projecttype;
	}

	public void setProjecttype(String projecttype) {
		this.projecttype = projecttype;
	}

	public String getAssociatetechnology() {
		return associatetechnology;
	}

	public void setAssociatetechnology(String associatetechnology) {
		this.associatetechnology = associatetechnology;
	}

	

	
	 
    
}