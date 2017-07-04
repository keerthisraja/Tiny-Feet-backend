package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.CategoryDAO;
import com.niit.ecartbackend.model.Category;

public class CategoryTest {
	
	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend.");
        context.refresh();
        
        CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
        Category category = (Category) context.getBean("Category");
        
        category.setName("keerthana");
        category.setDescription("adik");
		categoryDAO.saveOrUpdate(category);

}
}