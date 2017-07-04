package com.niit.ecartbackend.dao;

import com.niit.ecartbackend.model.UserRole;

public interface UserRoleDAO {

	public UserRole getbyName(String Username);

	public void saveOrUpdate(UserRole userRole);

	public void delete(String userId);

}
