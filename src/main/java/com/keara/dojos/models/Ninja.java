package com.keara.dojos.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name="ninjas")
public class Ninja {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, message="First name needs at least 2 letters for its name!")
	public String first_name;
	
	@Size(min=2, message="Last name needs to be 2 characters or longer!")
	public String last_name;
	
    @Min(value=0, message="Age must be greater than 0")
	public Integer age;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id")
    private Dojo dojo;

	@Column(updatable=false)
    private Date createdAt;
	
    private Date updatedAt;

	
	
	public Ninja(String first_name, String last_name, Integer age) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}



	public Ninja() {}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Dojo getDojo() {
		return dojo;
	}



	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}



	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public Date getUpdatedAt() {
		return updatedAt;
	}



	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
    	this.updatedAt = new Date();
    }
    
}
