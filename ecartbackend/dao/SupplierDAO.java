package com.niit.ecartbackend.dao;

import com.niit.ecartbackend.model.Supplier;
import java.util.List;

public interface SupplierDAO {
	
	public List<Supplier> list();
	
	public Supplier get(String id);
	
	public void saveOrUpdate(Supplier category);
	
	public void delete(String id);
	

}
