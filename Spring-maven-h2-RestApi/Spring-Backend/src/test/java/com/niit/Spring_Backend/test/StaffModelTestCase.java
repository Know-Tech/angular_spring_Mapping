package com.niit.Spring_Backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.StaffDao;
import com.niit.model.StaffModel;
import com.niit.service.StaffService;

public class StaffModelTestCase {

	private static AnnotationConfigApplicationContext context;

	private static StaffService staffService;

	private StaffModel staff;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		staffService = (StaffService) context.getBean("staffService");
	}

	@Test
	public void testInsertStaff() {

		staff = new StaffModel(); // staff.setId(1); staff.setStaff("Ziya");
		
		/*
		 staff.setStaff("Bala");
		 staff.setSkill("Java");
		 
		 assertEquals("Successfully Added..",true,staffDao.insert(staff));   */
		 
		// staff.setStaff("Mano");
		// staff.setSkill("PHP");
		// 
		// assertEquals("Successfully Added..",true,staffService.insert(staff));
	}

	/*
	 * @Test public void testGetStaff() {
	 * 
	 * staff = staffDao.get(1);
	 * 
	 * assertEquals("Successfully Fetch Record..","Mano",staff.getStaff()); }
	 */

	@Test
	public void testStaffUpdate() {

		staff = staffService.get(33);

		staff.setStaff("Mano Bala");

		assertEquals("Successfully Updated..", true, staffService.update(staff));
	}

	/*@Test
	public void testStaffDelete() {

		//staff = staffDao.get(1);
		//assertEquals("Successfully Deleted..", true, staffDao.delete(staff));
	} */

	@Test
	public void testStaffList() {

		assertEquals("Successfully Fetching Data..",2, staffService.findAll().size());
	} 

	/*
	 * @Test public void testStaffCrud() {
	 * 
	 * //insert
	 * 
	 * staff = new StaffModel(); //staff.setId(1); staff.setStaff("Bala");
	 * staff.setSkill("Java");
	 * 
	 * assertEquals("Successfully Added..",true,staffDao.insert(staff));
	 * 
	 * staff.setStaff("Mano"); staff.setSkill("PHP");
	 * 
	 * assertEquals("Successfully Added..",true,staffDao.insert(staff));
	 * 
	 * //update
	 * 
	 * staff = staffDao.get(1);
	 * 
	 * staff.setStaff("Mano Bala");
	 * 
	 * assertEquals("Successfully Updated..",true,staffDao.update(staff)); //Delete
	 * staff = staffDao.get(1);
	 * assertEquals("Successfully Deleted..",true,staffDao.delete(staff));
	 * 
	 * //StaffList
	 * assertEquals("Successfully Deleted..",1,staffDao.findAll().size()); }
	 * 
	 */
}
