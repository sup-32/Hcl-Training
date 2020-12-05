package com.hcl.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		List<UserReverse>userdetails=new ArrayList<>(n);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of Users");
	     n=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter details of user"+i);
			String str[]=sc.nextLine().split(",");
			userdetails.add(new UserReverse(str[0],str[1],str[2],str[3]));
		}
		Collections.sort(userdetails);
		Collections.reverse(userdetails);
		System.out.println("User Deatils in reverse order:");
		System.out.printf("%-15s%-15s\n","Name","MobileNumber");
		for(UserReverse u:userdetails)
		{
			System.out.println(u);
			sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
