package com.practice;

public class Delivery {
	Long over,ball,runs;
	String batsman,bowler,nonStriker;
	Delivery()
	{
		
	}
	public Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonStriker)
	{
		this.over=over;
		this.ball=ball;
		this.runs=runs;
		this.batsman=batsman;
		this.bowler=bowler;
		this.nonStriker=nonStriker;
	}
	public Long getOver() {
		return over;
	}
	public Long setOver(Long over) {
		return this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public Long setBall(Long ball) {
		return this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public Long setRuns(Long runs) {
		return this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public String setBatsman(String batsman) {
		return this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public String setBowler(String bowler) {
		return this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public String setNonStriker(String nonStriker) {
		return this.nonStriker = nonStriker;
	}
	

}
