package com.onimurasame.productcatalog.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onimurasame.productcatalog.data.Product;
import com.onimurasame.productcatalog.exception.CustomException;
import com.onimurasame.productcatalog.repository.ProductRepository;

@RestController
@RequestMapping(path = "/products")
class ProductController {

    @Autowired
   private ProductRepository productRepository;
//
//    @GetMapping
//    ResponseEntity<String> getProducts() throws JsonProcessingException {
//
//        List<Product> productList = new ArrayList<>();
//        productRepository.findAll().forEach(productList::add);
//
//        return new ResponseEntity<>(new ObjectMapper().writeValueAsString(productList), HttpStatus.OK);
//    }
    
	@GetMapping("/findall")
	public String findAll() {
		String result = "";
		for (Product product : productRepository.findAll()) {
			result += product.getId() + " " + product.getName() + "</br>";
		}
		return result;
	}

	@GetMapping("/findbyid")
	public String findById(@RequestParam("id") String id) {
		String result = "";
		Optional<Product> product= productRepository.findById(Integer.parseInt(id));
		if(product.isPresent()){
			Product presult = product.get();
			result = "Id : "+presult.getId() +" </br> Name : "+presult.getName();
		}
		return result;
	}

	@GetMapping("/save")
	public String process() {

		productRepository.saveAll(Arrays.asList(new Product("Shirts"), new Product("pants"), new Product("jeans")));

		return "Done";
	}

    @GetMapping("/exception")
    void getException() throws CustomException {
        throw new CustomException();
    }

}
