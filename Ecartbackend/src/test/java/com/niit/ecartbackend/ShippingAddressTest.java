
package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.ShippingAddressDAO;
import com.niit.ecartbackend.model.ShippingAddress;

public class ShippingAddressTest {
	
	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
        context.refresh();
        
        ShippingAddressDAO shippingaddressDAO = (ShippingAddressDAO) context.getBean("ShippingAddressDAO");
        ShippingAddress shippingaddress = (ShippingAddress) context.getBean("shippingAddress");
       
        
        shippingaddress.setUsername("keerthiraja");
		shippingaddress.setEmailid("keerthisraja27@gmail.com");
		shippingaddress.setAddress("Peelamedu");
		shippingaddress.setZipCode("fdgfs");
        shippingaddressDAO.saveOrUpdate(shippingaddress);
	}
}