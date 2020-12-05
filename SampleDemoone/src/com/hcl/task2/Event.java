package com.hcl.task2;

public class Event {
	protected String name;
	protected String detail;
	protected String ownerName;
	public Event(String name,String detail,String ownerName)
	{
		this.name=name;
		this.detail=detail;
		this.ownerName=ownerName;
	}
	public void displayEventDetails()
	{
		System.out.println("Event class:");
		System.out.println("Event Name:"+name);
		System.out.println("Event details:"+detail);
		System.out.println("Event Ownernmae:"+ownerName);
	}

}
