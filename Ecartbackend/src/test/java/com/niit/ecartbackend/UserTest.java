package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.UserDAO;
import com.niit.ecartbackend.model.User;

public class UserTest 
{


	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
        context.refresh();
        
        UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
        User user = (User) context.getBean("user");
        
        user.setLastName("raja");
        user.setUsername("keerthiraja");
		user.setEmailid("keerthisraja27@gmail.com");
		user.setPassword("jfkd");
		
		user.setPhoneNo(98765);
		user.setAddress("s12,Peelamedu");
        user.setZipCode(75426);
        
        userDAO.saveOrUpdate(user);
        
	}
}
