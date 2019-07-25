package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Staff {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String sname;
	private String skill;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Staff(String sname, String skill) {
		
		this.sname = sname;
		this.skill = skill;
	}
	public Staff() {
		
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", sname=" + sname + ", skill=" + skill + "]";
	}
	

}
