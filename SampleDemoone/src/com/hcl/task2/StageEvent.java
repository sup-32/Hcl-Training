package com.hcl.task2;

public class StageEvent extends Event {
	public int noOfShows;
	public int noOfSeats;
	public StageEvent(String name,String detail,String ownerName, int noOfShows,int noOfSeats)
	{
       super(name,detail,ownerName);
       this.noOfSeats=noOfSeats;
       this.noOfSeats=noOfShows;
       
	}
	public void displayEventDetails()
	{
		System.out.println("Event class:");
		System.out.println("Event Name:"+name);
		System.out.println("Event details:"+detail);
		System.out.println("Event Ownernmae:"+ownerName);
		System.out.println("No Of shows:"+noOfShows);
		System.out.println("No Of Seats:"+noOfSeats);
	}


}
