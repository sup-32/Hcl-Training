package com.player;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Wicket w=new Wicket();
		System.out.println("Enter the number of Wickets:");
		int wicket=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=wicket;i++)
		{
			System.out.println("Enter the details of wicket"+i);
			String str=sc.nextLine();
			String[] str1=str.split(",");
			w.setOver(Long.parseLong(str1[0]));
			w.setBall(Long.parseLong(str1[1]));
			w.setWicketType(str1[2]);
			w.setPlayerName(str1[3]);
			w.setBowlerName(str1[4]);
			System.out.println("wicket details");
			System.out.println("Over:"+w.getOver() +"\n"+ "Ball:"+w.getBall() +"\n"+ "Wicket:"+w.getWicketType() +"\n"+ 
			                       "Player Name:"+w.getPlayerName() +"\n"+ "Bowler Name:"+w.getBowlerName());
			
			}

	}
}

