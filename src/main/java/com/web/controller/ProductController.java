package com.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Product;
import com.domain.repository.ProductRepository;
import com.domain.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public List<Product> getAll(){
		return productService.getAll(); 
	}
	
	public Optional<Product> getProduct(int productId){
		return productService.getProduct(productId);
	}
	
	public Optional<List<Product>> geByCategory(int categoryId){
		return productService.getByCategory(categoryId);
	}
	
	public Product save(Product product) {
		return productService.save(product);
	}
	
	public boolean delete(int productId) {
		return productService.delete(productId);
	}
}
