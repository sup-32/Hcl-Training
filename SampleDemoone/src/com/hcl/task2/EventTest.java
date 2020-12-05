package com.hcl.task2;

import java.util.Scanner;

public class EventTest {

	public static void main(String[] args) {
		String str ;
		Scanner sc=new Scanner(System.in);
		System.out.println("ERnter type of Event\n 1.Exhibition\n2.StageEvent");
		int ch=sc.nextInt();
		sc.nextLine();
		if(ch==1) {
			System.out.println("Enter Exhibition Details:");
			str=sc.nextLine();
			String s[]=str.split(",");
			Event exhibition=new Exhibition(s[0],s[1],s[2],Integer.parseInt(s[3]));
			exhibition.displayEventDetails();
			}
		else if(ch==2)
		{
			System.out.println("Enter StaheEvent Details:");
			str=sc.nextLine();
			String s[]=str.split(",");
			Event stage=new StageEvent(s[0],s[1],s[2],Integer.parseInt(s[3]),Integer.parseInt(s[4]));
			stage.displayEventDetails();
			
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		

	}

}
