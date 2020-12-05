package com.hcl.task2;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter the shape:");
		System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();
			Shape circle=new Circle(radius);
			circle.computeArea();
		}
		else if(ch==2)
		{
			System.out.println("Enter the length and breadth:");
			double length=sc.nextDouble();
			double breadth=sc.nextDouble();
			Shape rectangle=new Rectangle(length,breadth);
			rectangle.computeArea();
		}
		else if(ch==3)
		{
			System.out.println("Enter the base and height:");
			double base=sc.nextDouble();
			double height=sc.nextDouble();
			Shape triangle=new Triangle(base,height);
			triangle.computeArea();
		}
		else
		{
			System.out.println("Invalid Choice");
		}
			
		}
		
}
