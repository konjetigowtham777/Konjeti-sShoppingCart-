package com.niit.databaseconfiguration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.entity.Authorities;
import com.niit.entity.BillingAddress;
import com.niit.entity.CartItem;
import com.niit.entity.Category;
import com.niit.entity.Customer;
import com.niit.entity.CustomerOrder;
import com.niit.entity.Product;
import com.niit.entity.ShippingAddress;
import com.niit.entity.User;

@Configuration
@EnableTransactionManagement

public class H2Config 
{
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		BasicDataSource datasource=new BasicDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/test");
		datasource.setUsername("sa");
		datasource.setPassword("sa");
		
		return datasource;
	}
	
	@Bean
	public SessionFactory sessionFactory()
	{
		LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties=new Properties();
		

    hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
	        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		hibernateProperties.setProperty("hibernate.show_sql","true");

		
		factory.addProperties(hibernateProperties);
		
		Class classes[]=new Class[]{Product.class , Category.class, User.class,Customer.class,Authorities.class,BillingAddress.class,ShippingAddress.class, CartItem.class , CustomerOrder.class};
		
		System.out.println("SessionFactory bean " +factory);
		return factory.addAnnotatedClasses(classes).buildSessionFactory();
		
		}
		
	@Bean
	public HibernateTransactionManager hibTransmanagement()
	{
		return new HibernateTransactionManager(sessionFactory());
	}
}
