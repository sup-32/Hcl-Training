package com.hcl.task5;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = null;
		Scanner sc=new Scanner(System.in);
		String names[]=new String[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the username"+(i+1));
			names[i]=sc.next();
			System.out.println("Do you want to continue?(y/n)");
			ch=sc.next();
		}
			
		    sc.close();
		for(int i1=0;i1<2;i1++)
		{
			System.out.println(names[i1]);
		}
		
		
			
	  
	}
	}
