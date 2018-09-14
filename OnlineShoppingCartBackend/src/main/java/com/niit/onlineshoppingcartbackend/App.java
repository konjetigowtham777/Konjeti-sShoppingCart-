package com.niit.onlineshoppingcartbackend;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.daoimpl.ProductDaoImpl;
import com.niit.databaseconfiguration.H2Config;
import com.niit.entity.Product;


public class App
{
    public static void main( String[] args )
    {
               
    	ApplicationContext context=new AnnotationConfigApplicationContext(H2Config.class,ProductDaoImpl.class);
    	
    	ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		
    	Product product=new Product();
/*
        product.setProductname("Biscuates");	
        product.setProductdesc("Milk Biscuates");
        product.setPrice(30);
	    product.setQuantity(7);
	    
	   productDao.saveProduct(product);
	   
	   
	    product.setProductname("Cream Biscuates");	
        product.setProductdesc("Milk cream Biscuates");
        product.setPrice(40);
	    product.setQuantity(13);
	    
	    productDao.saveProduct(product);
	   
	    product.setProductname("CDC Paste");	
        product.setProductdesc("Fresh mint paste");
        product.setPrice(70);
	    product.setQuantity(12);
	    
	    productDao.saveProduct(product);
	    product.setProductname("CAS Paste");	
        product.setProductdesc("Active salt paste");
        product.setPrice(60);
	    product.setQuantity(6);
	    
	    productDao.saveProduct(product);
	    product.setProductname("Santoor soap");	
        product.setProductdesc("Good for skin");
        product.setPrice(29);
	    product.setQuantity(50);
	    
	    productDao.saveProduct(product);
	    product.setProductname("Santoor handwash");	
        product.setProductdesc("Removes germs");
        product.setPrice(130);
	    product.setQuantity(4);
	    
	    productDao.saveProduct(product);
	   
	    product.setProductname("Munch");	
        product.setProductdesc("Waffy cream chocolate");
        product.setPrice(40);
	    product.setQuantity(13);
	    
	    productDao.saveProduct(product);
	   
	    product.setProductname("Milky bar");	
        product.setProductdesc("Milky creamy chocolate");
        product.setPrice(40);
	    product.setQuantity(13);
	    
	    productDao.saveProduct(product);
	   
  */  	 //productDao.deleteProduct(40);
    	 
    	 
	    List<Product> products=productDao.getAllProducts();
		for(Product p:products){
			System.out.println(p.getId() +" " +p.getPrice() +" " +p.getProductdesc() + " " +p.getProductname() + " " +p.getQuantity() + " ");
		}

    }
}
