package com.hcl.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User>userdetails=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of User details");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<=n;i++)
		{
		System.out.println("Enter the user" +i+ "detail");
		String str[]=sc.nextLine().split(",");
		userdetails.add(new User(str[0],str[1],str[2],str[3]));
		}
		int ch;
		do
		{
			System.out.println("Sort by\n1.Name\n2.Email");
			ch=sc.nextInt();
			if(ch==1)
			{
				Collections.sort(userdetails,new NameComparator());
			}
			else if(ch==2)
			{
				Collections.sort(userdetails,new EmailComaparator());
			}
			else
			{
				System.out.println("Exited");
			}
			System.out.printf("%-15s%-15s%-15s%-15s\n","Name","Email","UserName","Password");
			for(User user:userdetails)
			{
				System.out.println(user);
			}while(true);
			sc.close();
		}
	}
}
