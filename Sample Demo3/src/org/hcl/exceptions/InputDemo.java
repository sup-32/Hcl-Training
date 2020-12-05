package org.hcl.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		try {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	n=sc.nextInt();
	System.out.println("Entered value is:"+n);
		}
		catch(InputMismatchException ie)
		{
			ie.printStackTrace();
		}
	
	

	}

}
