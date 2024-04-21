package com.basic.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.basic.model.Product;

@Component
public class Productdao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//insert data
	@Transactional
	public void createProduct(Product product) {
		System.out.println("########### Product is " + product);
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//fetch data
	public List<Product> getProducts() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete data
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get the single product
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
}
