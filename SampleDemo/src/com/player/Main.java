package com.player;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name:");
		String name=sc.nextLine();
		System.out.println("Enter the country name:");
		String country=sc.nextLine();
		System.out.println("Enter the Skill:");
		String skill=sc.nextLine();
		System.out.println("Player Details:");
		Delivery d=new Delivery(name,country,skill);
		System.out.println("Player name:"+d.name+"\n"+d.country+"\n"+d.skill+"\n");

	}

}
