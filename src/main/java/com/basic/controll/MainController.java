package com.basic.controll;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.basic.dao.Productdao;
import com.basic.model.Product;

@Controller
public class MainController {
	@Autowired
	private Productdao productdao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = productdao.getProducts();
		m.addAttribute("product", products);
		return "index";
	}
	@RequestMapping("/add")
	public String adddata() {
		return "productform";
	}
	
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product p, HttpServletRequest request) {
		productdao.createProduct(p);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping(value="/delete/{id}")
	public RedirectView deleteProduct(@PathVariable("id") int id, HttpServletRequest request) {
		this.productdao.deleteProduct(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping(value = "/update/{id}")
	public String updateForm(@PathVariable("id") int id, Model model) {
		Product product = this.productdao.getProduct(id);
		model.addAttribute("product", product);
		return "updateform";
	}
}
