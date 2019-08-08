package com.test.SpringRESTService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import com.niit.dao.StaffDao;
import com.niit.model.StaffModel;
import com.niit.service.StaffService;

@RestController
public class StaffController {

	@Autowired
	StaffService staffService;
	
	/*@RequestMapping(value="/{staff}")
	public String staffCreate(StaffModel staff)
	{
		staffDAO.insert(staff);
		return null;
	}*/
	
	/*** Creating a new Student ***/
    @RequestMapping(value="/insert", method=RequestMethod.POST,headers = "Accept=application/json")
    public void createStudent(@RequestBody StaffModel staff)
    {
    	staffService.insert(staff);
    }
    
    @RequestMapping(value = "/findAll", method = RequestMethod.GET, headers = "Accept=application/json")
	public List getStaff() {
 
		List listOfStaff = staffService.findAll();
		return listOfStaff;
	}
    
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public StaffModel getById(@PathVariable("id") int id)
    {
    	return staffService.get(id);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateStaff(@RequestBody StaffModel staff) {
    	staffService.update(staff);
	}
 
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteStaff(@PathVariable("id") int id) {
		staffService.delete(id);  
	} 
    
}
