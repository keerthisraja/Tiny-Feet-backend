package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.ecartbackend.dao.SupplierDAO;
import com.niit.ecartbackend.model.Supplier;


public class SupplierTest {
	
	public static void main (String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
        context.refresh();
        
        SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
        Supplier supplier = (Supplier) context.getBean("supplier");
        
        supplier.setId("hddsjk");
        supplier.setName("hddsjk");
        supplier.setPhoneNo(994466);
		supplier.setEmailId("keerthiraja");
		supplier.setAddress("peelamedu");
        supplierDAO.saveOrUpdate(supplier);
}
}