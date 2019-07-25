package com.example.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Staff;
import com.example.repositories.StaffRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StaffController {

	@Autowired
	private StaffRepository staffRepository;
	
	@GetMapping("/staffs")
	public List<Staff> getStaffs()
	{
	return staffRepository.findAll();	
	}
	

	@GetMapping("/staff/{id}")
	public Optional<Staff> getStaff(@PathVariable Long id)
	{
	return staffRepository.findById(id);
	} 
	
	
	@DeleteMapping("/staff/{id}")
	public boolean deleteStaff(@PathVariable Long id)
	{
	 staffRepository.deleteById(id);
	 return true;
	} 
	
	@PostMapping("/staff")
	public Staff createStaff(Staff staff)
	{
	return staffRepository.save(staff);
	}
	
	@PutMapping("/staff")
	public Staff updateStaff(Staff staff)
	{
	return staffRepository.save(staff);
	}
}
