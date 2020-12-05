package com.work;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your car Number");
		int carNo=sc.nextInt();
		System.out.println("How many years old car do you have");
		int year=sc.nextInt();
		sc.nextLine();
		System.out.println(" Car Brand");
		String brand=sc.nextLine();
		Car car=new Service(carNo,year,brand);
		car.sum();
		car.years();
		car.brand();
		

	}

}
