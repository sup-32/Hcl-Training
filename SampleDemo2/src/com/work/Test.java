package com.work;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("What you want to visit");
		System.out.println("Rajmachi\nShivgadh\nMurud");
		String ch=sc.next();
		sc.nextLine();
		Fort f;
		if(ch.equalsIgnoreCase("Rajmachi"))
		{
			f=new Rajmachi();
			f.distance();
		}
		else if(ch.equalsIgnoreCase("Shivgadh"))
		{
			f=new Shivgadh();
			f.distance();
		}
		else
		{
			f=new Murud();
			f.distance();
		}

	}

}
