package com.niit.ecartbackend.dao;

import java.util.List;

import com.niit.ecartbackend.model.Cart;

public interface CartDAO {

	public List<Cart> list(String id);
	
	public List<Cart> list();
	
	public Cart get(String id);
	
	public void saveOrUpdate(Cart cart);
	
	public void delete(String cartId);
		
	public Long getTotalAmount(String id);
	
	public Long getCount(String username);
	
	public List<Cart> search(String keyWord);
	
	public boolean itemAlreadyExist(String userId, String productId, boolean b);
	
	public Cart getByUserandProduct(String userId, String productId);
	
	public void UpdateSatus(String username);
}
