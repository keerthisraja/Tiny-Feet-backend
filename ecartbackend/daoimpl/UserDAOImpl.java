package com.niit.ecartbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecartbackend.dao.UserDAO;
import com.niit.ecartbackend.model.User;

@Repository("UserDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	
@Autowired
private SessionFactory sessionFactory;


public UserDAOImpl(SessionFactory sessionFactory){
	this.sessionFactory = sessionFactory;
	}


public void saveOrUpdate(User user) {
	
	sessionFactory.getCurrentSession().saveOrUpdate(user);
}


public void delete(String user_Id){
	User userToDelete = new User();
	userToDelete.setUsersId(user_Id);
	sessionFactory.getCurrentSession().delete(userToDelete);
}


public User get(String username){
	String hql = "from User where username ='"+ username +"'";
	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<User> listUser = (List<User>) query.list();
	
	if (listUser != null && !listUser.isEmpty()){
		return listUser.get(0);
	}
	return null;
}


public List<User> list(){
	@SuppressWarnings({ "unchecked" })
	List<User> listUser = (List<User>)
	sessionFactory.getCurrentSession().createCriteria(User.class)
	.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	return listUser;
}



public boolean isValidUser(String name, String password, boolean b) {
	
	String hql = "from User where username= '" + name + "' and " + " password ='" + password+"'";
	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<User> list = (List<User>) query.list();
	if (list != null && !list.isEmpty()) {
		return true;
	}
	return false;

}

@Transactional
public boolean isAllReadyRegister(String email, boolean b) {
	
	String hql = "from User where emailid ='"+ email +"'";
			
				
	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<User> list = (List<User>) query.list();
	if (list != null && !list.isEmpty()) {
		return true;
	}
	return false;

}


public User getByEmail(String email) {
	String hql = "from User where emailid ='"+ email +"'";
	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<User> listUser = (List<User>) query.list();
	
	if (listUser != null && !listUser.isEmpty()){
		return listUser.get(0);
	}
	return null;
}


public User getById(String usersId) {
	String hql = "from User where usersId ='"+ usersId +"'";
	org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<User> listUser = (List<User>) query.list();
	
	if (listUser != null && !listUser.isEmpty()){
		return listUser.get(0);
	}
	return null;
}


	
}
