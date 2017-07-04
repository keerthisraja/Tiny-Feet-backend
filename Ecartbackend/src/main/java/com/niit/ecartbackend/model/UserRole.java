package com.niit.ecartbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table(name="userRole")
@Component
public class UserRole {
	
	@Id
	@GeneratedValue
    private String usersId;
	
   private String username;
	
	
	private String ContactNumber;
	
	private String emailid;
	
    private String role;
    
   
    

  	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}


	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String ContactNumber) {
		this.ContactNumber = ContactNumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	

	public String getRole() {
  		return role;
  	}

  	public void setRole(String role) {
  		this.role = role;
  	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
}
