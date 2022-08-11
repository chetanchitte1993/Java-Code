package com.microservice.service;

import java.util.List;
import java.util.Optional;

import com.microservice.entity.Product;
import com.microservice.repo.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> getAllProducts()
	{
		return productRepo.findAll();
	}
	
	public Optional<Product> getProductById(int pid)
	{
		return productRepo.findById(pid);
	}
	
	public Product saveProduct(Product product)
	{
		return productRepo.save(product);
	}
}
