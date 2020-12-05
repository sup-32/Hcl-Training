package com.work;

import java.util.Scanner;

public class PolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter breadth and ength of recatngle:");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		Polygon rectangle=new Rectangle(length,breadth);
		System.out.println("enter side value");
		double side=sc.nextDouble();
		Polygon square=new Square(side);
		System.out.println("perimeter of recatngle"+rectangle.calcPeri());
		System.out.println("Area of rectangle"+rectangle.calcArea());
		System.out.println("perimeter of Square"+square.calcPeri());
		System.out.println("ARe of Square"+square.calcArea());
		
		

	}

}
