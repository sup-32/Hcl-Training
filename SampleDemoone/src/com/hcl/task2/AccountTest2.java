package com.hcl.task2;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Details:");
		AccountBO accountbo=new AccountBO();
		String accdetails=sc.nextLine();
		FixedAccount fixedaccount=accountbo.getAccountDetails(accdetails);
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number\n","Balance\n",
				"Account holder name\n","Minimum balance\n","Locked period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n" ,fixedaccount.getAccountnumber(),fixedaccount.getBalance(),
				fixedaccount.getAccountHolderName(),fixedaccount.getMinimumBalance(),fixedaccount.getLockedPeriod());
		

	}

}
