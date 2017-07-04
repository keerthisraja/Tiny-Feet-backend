
package com.niit.ecartbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.ecartbackend.dao.CategoryDAO;
import com.niit.ecartbackend.dao.CreditCardDAO;
import com.niit.ecartbackend.dao.ProductDAO;
import com.niit.ecartbackend.dao.UserDAO;
import com.niit.ecartbackend.daoimpl.CategoryDAOImpl;
import com.niit.ecartbackend.daoimpl.CreditCardDAOImpl;
import com.niit.ecartbackend.daoimpl.ProductDAOImpl;
import com.niit.ecartbackend.daoimpl.UserDAOImpl;
import com.niit.ecartbackend.daoimpl.UserRoleDAOImpl;
import com.niit.ecartbackend.model.Cart;
import com.niit.ecartbackend.model.Category;
import com.niit.ecartbackend.model.CreditCard;
import com.niit.ecartbackend.model.Product;
import com.niit.ecartbackend.model.ShippingAddress;
import com.niit.ecartbackend.model.Supplier;
import com.niit.ecartbackend.model.User;
import com.niit.ecartbackend.model.UserRole;
import com.niit.ecartbackend.dao.CartDAO;
import com.niit.ecartbackend.daoimpl.CartDAOImpl;
import com.niit.ecartbackend.dao.SupplierDAO;
import com.niit.ecartbackend.daoimpl.SupplierDAOImpl;
import com.niit.ecartbackend.dao.ShippingAddressDAO;
import com.niit.ecartbackend.daoimpl.ShippingAddressDAOImpl;
import com.niit.ecartbackend.dao.UserRoleDAO;

@Configuration
@ComponentScan("com.niit.ecartbackend")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	
	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		DriverManagerDataSource  dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/cart");

		dataSource.setUsername("sa");
		dataSource.setPassword("");
		

		return dataSource;
	}
	
	
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");

		return properties;
}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClasses(User.class);
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(ShippingAddress.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(CreditCard.class);
		sessionBuilder.addAnnotatedClass(UserRole.class);
		return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		
		
		return transactionManager;
	}

	
		@Autowired(required = true)	
		@Bean(name = "UserDAO")
		public UserDAO getUserDAO(SessionFactory sessionFactory) {
	return new UserDAOImpl(sessionFactory);
		}
		




         @Autowired(required = true)
         @Bean(name = "CategoryDAO")
         public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {
	 return new CategoryDAOImpl(sessionFactory);
         }
		
         @Autowired(required = true)
     	@Bean(name = "CartDAO")
     	public CartDAO getCartDAO(SessionFactory sessionFactory) {
     		return new CartDAOImpl(sessionFactory);
     }
		

     	@Autowired(required = true)
     	@Bean(name = "SupplierDAO")
     	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
     		return new SupplierDAOImpl(sessionFactory);
     }
		
		
     	@Autowired(required = true)
    	@Bean(name = "CreditCardDAO")
    	public CreditCardDAO getCreditCardtDAO(SessionFactory sessionFactory) {
    return new CreditCardDAOImpl(sessionFactory);
     	}
     	
     	@Autowired(required = true)
    	@Bean(name = "productDAO")
    	public ProductDAO getproductDAO(SessionFactory sessionFactory) {
    		return new ProductDAOImpl(sessionFactory);
    }
     	
     	@Autowired(required = true)
    	@Bean(name = "ShippingAddressDAO")
    	public ShippingAddressDAO getShippingAddressDAO(SessionFactory sessionFactory) {
    return new ShippingAddressDAOImpl(sessionFactory);
     	}


        @Autowired(required = true)
	    @Bean(name = "UserRoleDAO")
	    public UserRoleDAO getUserRoleDAO(SessionFactory sessionFactory) {
		return new UserRoleDAOImpl(sessionFactory);
        }
}