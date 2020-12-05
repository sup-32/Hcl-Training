package com.work;

public class Service implements Car {
	private static double serviceCharge=5000;
	private int carNo;
	private int year;
	private String brand;
	public Service(int carNo,int years,String brand)
	{
		this.carNo=carNo;
		this.year=year;
		this.brand=brand;
	}
	public void sum() {
		int n1,sum=0;
		int no=this.carNo;
		while(no!=0)
		{
			n1=no%10;
			sum=sum+n1;
			no=no/10;
		}
		if(sum%2==0)
		{
		System.out.println("You can come on Tuesday,Thursday,Saturday");
		}
		else
		{
			System.out.println("You can come on Monday,Wednesday,Friday");
		}
		
	}
	public void years()
	{
		if(this.year>=5)
		{
			System.out.println("You are eligible for free washing");
		}
		else
		{
			System.out.println("You are not eligible for free washing");
		}
	}
	public void brand()
	{
		if(this.brand.equalsIgnoreCase("MARUTHI"))
		{
			Service.serviceCharge -=(Service.serviceCharge*5f/100);
			System.out.println("Your servicing charges are"+Service.serviceCharge);
		}
	}
}