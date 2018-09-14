package com.niit.daoimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.databaseconfiguration.H2Config;
import com.niit.entity.Product;

public class ProductDaoImplTest1 {

	
	
	ApplicationContext context=new AnnotationConfigApplicationContext(H2Config.class,ProductDaoImpl.class);
	ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
	
	/*@Test
	public void testUpdateProduct() 
	{
		Product product=productDao.getProduct(37);
		product.setPrice(1000);
		product.setQuantity(41);
		productDao.updateProduct(product);
		assertTrue(product.getPrice()==1000);
		assertTrue(product.getQuantity()==41);
		
	}*/

	public void testGetAllProduct() 
	{
		List<Product> products=productDao.getAllProducts();
    	assertTrue(products.size()>0);
    	assertFalse(products.isEmpty());
	}

	
	}