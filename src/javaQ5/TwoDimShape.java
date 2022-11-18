package javaQ5;

public class TwoDimShape extends Shape{
	double area;
	double x;
	double y;
	
	public TwoDimShape(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	public double getArea() {
		return area;
	}
	
	public double Ellipse (double x, double y) {
		area = (x/2)*(y/2)*3.14;
		return area;
	}
	
	public double Rectangle(double x, double y) {
		area = x*y;
		return area;
	}
	
	public double Triangle(double x, double y) {
		area = x*y/2;
		return area;
	}
	
	public String toString() {
		return "도형의 면적은 = " + getArea();
	}

}
