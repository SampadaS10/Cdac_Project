package com.jewellery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jewellery.entity.Product;
import com.jewellery.repo.ProductRepo;

@Controller
public class ProductController 
{
	@Autowired
	private ProductRepo prodrepo;
//	
//	@GetMapping("/addproduct")
//	public String insert()
//	{
//		//Product product_inserted=prodrepo.save(newproduct);
//		System.out.println("Get Request");
//		return "admin/index";
//	}
	
	@RequestMapping("/addproduct")
	public String insert(@ModelAttribute Product newproduct)
	{
		//Product product_inserted=prodrepo.save(newproduct);
		System.out.println(newproduct);
		return "admin/index";
	}
}
