package com.niit.service;

import java.util.List;

import com.niit.model.StaffModel;

public interface StaffService {

	public boolean insert(StaffModel staff);
	public boolean update(StaffModel staff);
	public boolean delete(int id);
	public List<StaffModel> findAll();
	public StaffModel get(int id);
	
}
