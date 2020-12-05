package org.hcl.exceptions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int cost,value,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost for n days");
		cost=sc.nextInt();
		System.out.println("Enter the value of n");
		value=sc.nextInt();
		try
		{ 
			result=(cost/value);
		System.out.println(result);
		System.out.println("cost per day of the item is "+result);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}

	}

}
