package com.practice;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Delivery d=new Delivery();
		System.out.println("Enter the over");
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
		over=d.setOver(over);
		ball=d.setBall(ball);
		runs=d.setRuns(runs);
		batsman=d.setBatsman(batsman);
		bowler=d.setBowler(bowler);
		nonStriker=d.setNonStriker(nonStriker);
		System.out.println("Over:"+d.getOver() +"\n"+ "Ball:"+d.getBall() +"\n"+ "Runs:"+d.getRuns() +"\n"+ 
		                            "Batsman:"+d.getBatsman() +"\n"+ "Bowler:"+d.getBowler() +"\n"+ "Nonstriker:"+d.getNonStriker());

	}

}
