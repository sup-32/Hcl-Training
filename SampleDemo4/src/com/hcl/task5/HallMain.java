package com.hcl.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class HallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>mylist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Halls");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Hall Name"+(i+1));
			String name=sc.next();
			mylist.add(name);
		}
		System.out.println("Enter the hall name to be searched:");
		String ch=sc.next();
		boolean result=mylist.contains(ch);
		if(result==true)
		{
			System.out.println(ch+ "hall is found in the list at" +mylist.indexOf(ch));
		}
		else
		{
		 System.out.println(ch+ "hall not found" +mylist.indexOf(ch));
		}
		
		

	}

}
