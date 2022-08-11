package com.microservice.controller;

import java.util.List;
import java.util.Optional;

import com.microservice.entity.Product;
import com.microservice.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//fetch product list
	@GetMapping("/")
	public List<Product> getProducts()
	{
		return productService.getAllProducts();
	}
	
	//fetch product by id
	@GetMapping("{id}")
	public Optional<Product> getProductById(@PathVariable int pid)
	{
		return productService.getProductById(pid);
	}
	
	//save product
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product p)
	{
		return productService.saveProduct(p);
	}
	
	
}
