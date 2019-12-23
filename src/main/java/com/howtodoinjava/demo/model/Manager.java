package com.howtodoinjava.demo.model;



import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="TBLE126_EMPLOYEES")
@Access(value=AccessType.FIELD)
public class Manager {

	/*   @OneToOne(mappedBy = "manag", cascade = CascadeType.ALL)
	   @Column(name = "id", unique = true, nullable = false)
	   @JoinColumn(name = "id", nullable = false)
private Project project;

	 @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private User user;
	
	
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}*/
	
	 @OneToOne(fetch = FetchType.LAZY, optional = false)
	 
	
	    @JoinColumn(name = "id", nullable = false)
	    private Project project;
	 
	 public Project getProject() {
			return project;
		}

		public void setProject(Project project) {
			this.project = project;
		}
		
	
	
	
	

	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	    
	
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="managername")
    private String managername;



	public String getManagername() {
		return managername;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

}