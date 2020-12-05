package com.hcl.task2;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Account Type\n");
		System.out.println("1.Saving Account\n2.Current Account");
		int ch=sc.nextInt();
		sc.nextLine();
		if(ch==1)
		{
		System.out.println("Enter Account details in comma separated(Account Name,Account Number,"
				+ "Bank Name,Organisation Name)");
		str=sc.nextLine();
		String s[]=str.split(",");
		Account savingaccount=new SavingAccount(s[0],s[1],s[2],s[3]);
		savingaccount.display();
		}
		else
		{
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,"
					+ "Bank Name,TinNumber)");
			str=sc.nextLine();
		String s[]=str.split(",");
		Account currentaccount=new CurrentAccount(s[0],s[1],s[2],s[3]);
		currentaccount.display();
		}

}
}