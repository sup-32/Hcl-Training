package com.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the over:");
		Long over=sc.nextLong();
		System.out.println("Enter the ball:");
		Long ball=sc.nextLong();
		System.out.println("Enter the runs:");
		Long runs=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name:");
		String batsman=sc.nextLine();
		System.out.println("Enter the bowler name:");
		String bowler=sc.nextLine();
		System.out.println("Enter the nonStricker name:");
		String nonStriker=sc.nextLine();
		Player p=new Player(over,ball,runs,batsman,bowler,nonStriker);
		p.displayPlayerDetails();
	}
}
