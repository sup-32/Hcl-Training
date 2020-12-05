package org.hcl.exceptions;

public class ItemType {
	String name;
	String deposit;
	double costPerDay;
	public ItemType()
	{
		
	}
	public ItemType(String name,String deposit,Double costPerDay)
	{
		this.name=name;
		this.deposit=deposit;
		this.costPerDay=costPerDay;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public String getDeposit() {
		return deposit;
	}
	public String setDeposit(double d) {
		return this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public double setCostPerDay(double costPerDay) {
		return this.costPerDay = costPerDay;
	}
	public String toString()
	{
		return String.format("%s\t%f\t%d",this.name,this.deposit,this.costPerDay);
		
	}
	
}
