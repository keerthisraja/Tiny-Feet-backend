package com.niit.ecartfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ecartbackend.dao.CategoryDAO;
import com.niit.ecartbackend.dao.ProductDAO;
import com.niit.ecartbackend.dao.SupplierDAO;
import com.niit.ecartbackend.model.Category;
import com.niit.ecartbackend.model.Product;
import com.niit.ecartbackend.model.Supplier;

@Controller
public class HomeController {

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("/")
	public String homePage(Model model) {
		
		return "home";
	}
@RequestMapping("home")
public String HomePage(Model model){
	

	return "home";
}

	@RequestMapping("loginpage")
	public String loginpage(Model model) {
		

		
		model.addAttribute("loginButtonClicked", true);
		return "home";
	}

	

}