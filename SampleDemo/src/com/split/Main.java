package com.split;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the player details:");
Player p= new Player();
details=sc.nextLine();
String det[]=details.split(",");
System.out.println("Player Details");
p.name=det[0];
p.country=det[1];
p.skill=det[2];
System.out.println("Player Name:"+p.name+"\n"+"Country Name:"+p.country+"\n"+"Skill:"+p.skill);
}

}
