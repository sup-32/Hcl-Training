package org.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.hcl.domain.Product;
import org.hcl.service.exception.ProductNotFound;

public class ProductServiceImplementation implements ProductService {
	List<Product>products=new ArrayList<>();
	public boolean insertProduct(Product product) {
		// TODO Auto-generated method stub
		List<Product>products=new ArrayList<>();
		if(product!=null)
		{
		return products.insert(products);
		}
		else
		{
		return false;
		}

	}
	public boolean removeProduct(int id) throws ProductNotFound {
		// TODO Auto-generated method stub
		boolean b=false;
		Product product=getProduct(id);
		if(product!=null)
		{
		b=products.remove(product);
		}
		else
		{
		throw new ProductNotFound("no product existed with id");
		}
		return b;
	}
		
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}
	private Product getProduct(int ProductId) {
		// TODO Auto-generated method stub
		Product product=null;
		for(Product products2:products)
		{
		if(ProductId==products.getProduct(ProductId))
		{
		product=products2;
		break;
		}
		}
		return product;
		}
	

}
