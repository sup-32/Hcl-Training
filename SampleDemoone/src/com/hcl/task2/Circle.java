package com.hcl.task2;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void computeArea()
	{
		super.area=Math.PI*(this.radius*this.radius);
		System.out.printf("Area of circle:%2f",super.area);
	}
	

}
