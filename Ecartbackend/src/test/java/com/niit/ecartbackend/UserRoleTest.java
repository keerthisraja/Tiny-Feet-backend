package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.ecartbackend.dao.UserRoleDAO;
import com.niit.ecartbackend.model.UserRole;

public class UserRoleTest {

	

	public static void main (String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
        context.refresh();

        UserRoleDAO userRoleDAO = (UserRoleDAO) context.getBean("UserRoleDAO");
        UserRole userRole = (UserRole) context.getBean("userRole");

        userRole.setUsername("kjgdffd");
        userRole.setEmailid("hgfshdghj");
        userRole.setContactNumber("keerthi");
        userRole.setRole("ROLE_USER");


       userRoleDAO.saveOrUpdate(userRole);

	}
}
