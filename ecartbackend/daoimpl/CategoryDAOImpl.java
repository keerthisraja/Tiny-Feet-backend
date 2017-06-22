package com.niit.ecartbackend.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecartbackend.dao.CategoryDAO;
import com.niit.ecartbackend.model.Category;

@Repository("CategoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
}
	

	public List<Category> list() {
		
		
				@SuppressWarnings("unchecked")
				List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
return listCategory;
	}

	public Category get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdate(Category category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public void editCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	public List<Category> search(String keyWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
