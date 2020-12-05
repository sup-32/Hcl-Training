package org.hcl.exceptions;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String deposit;
		double costPerDay;
		ItemType item=new ItemType();
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the item type details:");
		System.out.println("Enter the Name");
		name=sc.nextLine();
		System.out.println("Enter the deposit");
		deposit=sc.nextLine();
		System.out.println("Enter the CostPerDay");
		costPerDay=sc.nextDouble();
		name=item.setName(name);
		deposit=item.setDeposit(Double.parseDouble(deposit));
		costPerDay=item.setCostPerDay(costPerDay);
		Double d=Double.valueOf(deposit);
	    System.out.println("The details of the items are:");
		System.out.println(item);
		
		}
		catch(NumberFormatException ne)
		{
			ne.printStackTrace();
		}
	

	}

}
