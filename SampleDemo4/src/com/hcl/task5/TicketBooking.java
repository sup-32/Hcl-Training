package com.hcl.task5;

public class TicketBooking implements Comparable {
	private String customerName;
	private Integer price;
	TicketBooking()
	{
		
	}
	public TicketBooking(String customerName,Integer price)
	{
		this.customerName=customerName;
		this.price=price;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
