package com.hcl.task5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>setlist=new TreeSet<>();
		String ch;
		Scanner sc=new Scanner(System.in);
		String[] names=new String[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the UserName"+(i+1));
			String name=sc.next();
			setlist.add(name);
			System.out.println("Do You Want to continue?(y/n)");
			ch=sc.next();
		}
	    Set<String>newlist=new TreeSet<>();
	    int count=0;
	    for(String list:setlist)
	    {
	    	if(!newlist.contains(list))
	    	{
	    		newlist.add(list);
	    		count++;
	    	}
	    }
	  
		System.out.println("Number of Users="+count);
	


	}

}
