package com.niit.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "staffskill")
@Component
public class StaffModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String staff, skill;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public StaffModel() {

	}

	@Override
	public String toString() {
		return "StaffModel [id=" + id + ", staff=" + staff + ", skill=" + skill + "]";
	}

}
