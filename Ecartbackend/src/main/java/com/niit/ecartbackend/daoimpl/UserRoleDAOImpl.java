package com.niit.ecartbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecartbackend.dao.UserRoleDAO;
import com.niit.ecartbackend.model.User;
import com.niit.ecartbackend.model.UserRole;

@Repository("UserRoleDAO")
public class UserRoleDAOImpl implements UserRoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public UserRoleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<UserRole> list() {
		@SuppressWarnings({ "unchecked" })
		List<UserRole> listUserRole = (List<UserRole>)
		sessionFactory.getCurrentSession().createCriteria(UserRole.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUserRole;
	}

	@Transactional
	public void saveOrUpdate(UserRole userRole) {
		sessionFactory.getCurrentSession().saveOrUpdate(userRole);
		
	}

	@Transactional
	public void delete(String userId) {
		User userRoleToDelete = new User();
		userRoleToDelete.setUsersId(userId);
		sessionFactory.getCurrentSession().delete(userRoleToDelete);
	}

	public UserRole getbyName(String Username) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
