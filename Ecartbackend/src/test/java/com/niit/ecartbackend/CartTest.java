package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.CartDAO;
import com.niit.ecartbackend.model.Cart;

public class CartTest {
	
	public static void main (String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
        context.refresh();
        
        CartDAO cartDAO = (CartDAO) context.getBean("CartDAO");
        Cart cart = (Cart) context.getBean("cart");
        
        cart.setUserName("keerthana");
        cart.setUserId("keerthiraja");
        cart.setProductName("tumy");
        cart.setProductId("tumytoys");
        cart.setPrice(1000);
        cart.setTotal(1);
        cart.setQuantity(20);
        cartDAO.saveOrUpdate(cart);
	}
}
