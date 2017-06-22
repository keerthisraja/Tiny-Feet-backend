package com.niit.ecartbackend.dao;


import java.util.List;

import com.niit.ecartbackend.model.UserRole;

public interface UserRoleDAO {
	
	public UserRole get(String username);

	public List<UserRole> list();	
	
	public void saveOrUpdate(UserRole userRole);
		
	public void delete(String userId);

}
