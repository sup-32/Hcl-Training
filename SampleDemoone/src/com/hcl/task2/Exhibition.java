package com.hcl.task2;

public class Exhibition extends Event{
	public int noStalls;
	public Exhibition(String name,String detail,String ownerName,int noStalls)
	{
		super(name,detail,ownerName);
		this.noStalls=noStalls;
	}
		public void displayEventDetails()
		{
			System.out.println("Event class:");
			System.out.println("Event Name:"+name);
			System.out.println("Event details:"+detail);
			System.out.println("Event Ownernmae:"+ownerName);
		}

	}


