package com.niit.dao;

import java.util.List;

import com.niit.entity.CartItem;
import com.niit.entity.CustomerOrder;
import com.niit.entity.User;
public interface CartItemDao {
	void addToCart(CartItem cartItem);
	User getUser(String email);
	List<CartItem>  getCart(String email);//select * from cartitem where user_email=?
	void removeCartItem(int cartItemId);
	CustomerOrder createCustomerOrder(CustomerOrder customerOrder);


}
