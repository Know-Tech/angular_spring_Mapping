package com.niit.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.StaffModel;

@Repository("staffDAO")
@Transactional
public class StaffDaoImpl implements StaffDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public StaffDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public boolean insert(StaffModel staff) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		// Transaction tx =session.beginTransaction();

		try {

			// sessionFactory.getCurrentSession().persist(staff);

			session.persist(staff);
			// tx.commit();

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			// tx.rollback();
			return false;
		}
	}

	public boolean update(StaffModel staff) {
		try {

			sessionFactory.getCurrentSession().update(staff);

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}

	}

	public boolean delete(int id) {
		try {
			Session session = sessionFactory.getCurrentSession();
			StaffModel st = (StaffModel) session.load(StaffModel.class, new Integer(id));
			if (null != st) {
				session.delete(st);
			}

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}

	}

	public List<StaffModel> findAll() {

		String str = "From StaffModel";

		Query<StaffModel> query = sessionFactory.getCurrentSession().createQuery(str);

		return query.getResultList();
	}

	@Override
	public StaffModel get(int id) {

		return sessionFactory.getCurrentSession().get(StaffModel.class, Integer.valueOf(id));
	}

}
