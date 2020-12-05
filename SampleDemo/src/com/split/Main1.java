package com.split;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the extratype details:");
		ExtraType e=new ExtraType();
		str=sc.nextLine();
		String s[]=str.split("#");
		System.out.println("ExtraType Details");
		e.name=s[0];
		e.runs=(long) Integer.parseInt(s[1]);
		System.out.println("Extra Type:"+e.name +"\n"+"Runs:"+e.runs);
		
		
		

	}

}
