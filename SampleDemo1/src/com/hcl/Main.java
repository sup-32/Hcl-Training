package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Account Type:");
		System.out.println("1.Saving Account\n 2.Current Account");
		int ch=sc.nextInt();
		sc.nextLine();
		details=sc.nextLine();
		if(ch==1)
		{
			System.out.println("Enter Account Details in Comma Seperated(Account Name,Account Number,Bank Name,Organisation Name");
			String str[]=details.split(",");
			SavingAccount s=new SavingAccount(str[0],str[1],str[2],str[3]);
			s.display();
		}
		else
		{
			System.out.println("Enter Account Details in Comma Seperated(Account Name,Account Number,Bank Name,TINNumber");
			String str[]=details.split(",");
			CurrentAccount c=new CurrentAccount(str[0],str[1],str[2],str[3]);
			c.display();
		}
		

	}

}
