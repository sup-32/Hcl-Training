package com.hcl.task2;

import java.util.Scanner;

public class StallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stall stall=new Stall();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		stall.setName(sc.nextLine());
		System.out.println("Enter the details of the stall:");
		stall.setDetail(sc.nextLine());
		System.out.println("Enter the owner name");
		stall.setOwnerName(sc.nextLine());
		String stalltype;
		System.out.println("Enter the type of stall:");
		stalltype=sc.nextLine();
		int stallfeet;
		System.out.println("Enter size of stall in square feet:");
		stallfeet=sc.nextInt();
		sc.nextLine();
		System.out.println("Does all have TV?(y/n)");
		String ch=sc.nextLine();
		if(ch.equalsIgnoreCase("y"))
		{
			System.out.println("Enter number of TV:");
			int noTv=sc.nextInt();
			Integer stallFeet;
			System.out.println("cost of stall is:"+stall.computeCost(stalltype, stallfeet, noTv));
		}
		else
		{
			System.out.println("cost of stall is:"+stall.computeCost(stalltype, stallfeet, stallfeet));
			
		}
		

	}

}
