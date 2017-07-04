package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.ProductDAO;
import com.niit.ecartbackend.model.Product;

public class ProductTest {
	
	public static void main (String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
        context.refresh();
		
        
        ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
        Product product = (Product) context.getBean("product");
        
        product.setProductId("keerthiraja");
        product.setProductName("keerthana");
        product.setDescription("softtoys");
        product.setProductPrice(500);
        product.setProductStock(20);
        productDAO.saveOrUpdate(product);
}
}