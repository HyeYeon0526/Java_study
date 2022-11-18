package javaQ5;

public class ThreeDimShape extends Shape{
	double volum;
	double x, y, z;
	
	
	public ThreeDimShape(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = x;
		
	}
	public double getVolum() {
		return volum;
	}
	
	public double Shpere(double x, double y, double z) {
		volum = ((x/2)*(y/2)*3.14*z)*2/3;
		return volum;
	}
	
	public double Cube(double x, double y, double z) {
		volum = x*y*z;
		return volum;
	}
	
	public double Sylinder(double x, double y, double z) {
		volum = (x/2)*(y/2)*3.14*z;
		return volum;
	}
	
	public String toString() {
		return "도형의 체적은 = " + getVolum();
	}
}
