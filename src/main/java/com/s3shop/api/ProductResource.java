package com.s3shop.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.s3shop.model.Product;

@Path("product")
public class ProductResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAllProducts(){
		List<Product> list=new ArrayList<Product>();
		Product p1=new Product();
		p1.setProduct_id( 100);
		p1.setName("careVe");
		p1.setSerial_number("112careVe");
		p1.setDescription("Utilizes patented MVE® controlled-release tech");
		p1.setCategory_id(11);
		p1.setPublished(1);
		
		Product p2=new Product();
		p2.setProduct_id( 101);
		p2.setName("Aveeno");
		p2.setSerial_number("113aveeno");
		p2.setDescription("it makes baby's skin soft");
		p2.setCategory_id(10);
		p2.setPublished(1);
		
		Product p3=new Product();
		p3.setProduct_id( 101);
		p3.setName("CA oil");
		p3.setSerial_number("113ca");
		p3.setDescription("massaging baby's skin");
		p3.setCategory_id(10);
		p3.setPublished(1);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		return list;

		
		
	}
	
	
}
