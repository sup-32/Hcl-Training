package com.hcl.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>alist=new ArrayList<>();
		String ch;
		Scanner sc=new Scanner(System.in);
		String names[]=new String[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the UserName"+(i+1));
			String name=sc.next();
			alist.add(name);
			System.out.println("Do you want to continue?(y\n)");
			ch=sc.next();
			
		}
		sc.close();
		System.out.println("The names entered are:");
		
		for(int i=0;i<alist.size();i++)
		{
			
			System.out.println(alist.get(i));
		}
			
		

	}

}
