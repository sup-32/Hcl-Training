package com.practice;

public class Player {
	Long over,ball,runs;
	String batsman,bowler,nonStriker;
	Player(Long over,Long ball,Long runs,String batsman,String bowler,String nonStriker)
	{
		this.over=over;
		this.ball=ball;
		this.runs=runs;
		this.batsman=batsman;
		this.bowler=bowler;
		this.nonStriker=nonStriker;
	}
	void displayPlayerDetails()
	{
		System.out.println("Delivary Details");
		System.out.println("Over:"+over+"\n"+"Ball:"+ball+"\n"+"Runs:"+runs+"\n"+"Batsman:"+batsman+"\n"+"Bowler:"+bowler+"\n"+"NonStricker:"+nonStriker+"\n");
	}
}
