package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.StaffDao;
import com.niit.model.StaffModel;

@Service("staffService")
public class StaffServiceImple implements StaffService{

	@Autowired
	private StaffDao staffDao;
	
	public boolean insert(StaffModel staff) {
		// TODO Auto-generated method stub
		return staffDao.insert(staff);
	}

	@Override
	public boolean update(StaffModel staff) {
		// TODO Auto-generated method stub
		return staffDao.update(staff);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return staffDao.delete(id);
	}

	@Override
	public List<StaffModel> findAll() {
		// TODO Auto-generated method stub
		return staffDao.findAll();
	}

	@Override
	public StaffModel get(int id) {
		// TODO Auto-generated method stub
		return staffDao.get(id);
	}

	
}
