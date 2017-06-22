package com.niit.ecartbackend.dao;

import java.util.List;

import com.niit.ecartbackend.model.CreditCard;

public interface CreditCardDAO {
	public List<CreditCard> list();
	
	public CreditCard get(String id);
	
	public void saveOrUpdate(CreditCard creditcard);
	
	public void delete(String id);
	
	public void editCreditCard(CreditCard creditcard);


}
