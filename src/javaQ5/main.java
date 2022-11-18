package javaQ5;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Shape[] shp = new Shape[6];

		for(int i = 0; i < 3; i++) {
			shp[i] = new TwoDimShape(2,3);
		}
		
		for(int i = 3; i < 6; i++) {
			shp[i] = new ThreeDimShape(2,3,4);
		}

		System.out.println(shp[0].Ellipse());
		
		
	}

}
