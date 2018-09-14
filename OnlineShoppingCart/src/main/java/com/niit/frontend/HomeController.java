package com.niit.frontend;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.CartItemDao;
import com.niit.dao.ProductDao;
import com.niit.entity.CartItem;

@Controller
public class HomeController {
	@Autowired
private ProductDao productDao;	
	   @Autowired
		private CartItemDao cartItemDao;

public HomeController(){
	System.out.println("HomeController bean is instantiated");
}
//http://localhost:8080/project1frontend/home - This request will be handled
//by this handler method homePage()
@SuppressWarnings("deprecation")
@RequestMapping(value={"/", "/Home"})
public String homePage(HttpSession session) //,@AuthenticationPrincipal Principal principal)
{
	session.setAttribute("categories",productDao.getAllCategories());
	//String email=principal.getName();
	//List<CartItem> cartItems=cartItemDao.getCart(email);
//	session.setAttribute("cartSize",cartItems.size());
	return "Home";
}
@RequestMapping(value="/AboutUs")
public String aboutusPage(){
	return "AboutUs";
}
@RequestMapping(value="/login")
public String login(){
	return "login";
}
@RequestMapping(value="/loginerror")
public String loginFailed(Model model){
	model.addAttribute("error","Invalid credentials..");
	return "login";
}
@RequestMapping(value="/logout")
public String logout(Model model){
	model.addAttribute("msg","Loggedout successfully...");
	return "login";
}
}