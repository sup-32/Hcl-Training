package com.hcl.task2;

public class Stall {
	protected String name;
	protected String detail;
	protected String ownerName;
	static final double Platinum=200;
	static final double Diamond=150;
	static final double Gold=100;
	static final double TV=10000;
	public Stall()
	{
		
	}
	public Stall(String name, String detail, String ownerName) {
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Double computeCost(String stallType,Integer squareFeet,Integer numberOfTV)
	{
		double totalCost=0;
		if(stallType.equalsIgnoreCase("platinum"))
		{
			totalCost=Platinum*squareFeet;
		}
		else if(stallType.equalsIgnoreCase("Diamond"))
		{
			totalCost=Diamond*squareFeet;
		}
		else if(stallType.equalsIgnoreCase("Gold"))
		{
			totalCost=Diamond*squareFeet;
		}
		return totalCost+numberOfTV*TV;
		
		}
	}
