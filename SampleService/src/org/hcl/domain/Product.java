package org.hcl.domain;

import java.io.Serializable;

public class Product implements Serializable {
	private  Integer productId;
	private String productName;
	private String productDelivery;
	public Product()
	{
		
	}
	public Product(Integer productId, String productName, String productDelivery) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDelivery = productDelivery;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDelivery() {
		return productDelivery;
	}
	public void setProductDelivery(String productDelivery) {
		this.productDelivery = productDelivery;
	}
	public String toString()
	{
		return String.format("%d\t%s\t%s",this.productId,this.productName,this.productDelivery);
	}

}
