package com.place;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the venue name:");
String name=sc.nextLine();
System.out.println("Enter the city name:");
String city=sc.nextLine();
System.out.println("Enter the venue details:");
Venue v=new Venue(name,city);
System.out.println("Venue name:"+v.name+"\n"+"City name:"+v.city+"\n");
	}

}
