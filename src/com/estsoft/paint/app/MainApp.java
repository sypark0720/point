package com.estsoft.paint.app;

import com.estsoft.paint.i.Drawable;
import com.estsoft.point.*; //point밑의 모든 class를 import
import com.estsoft.shape.Shape;
import com.estsoft.shape.Triangle;

public class MainApp {

	public static void main(String[] args) {
		Point point = new Point();
		
		point.setX(100);
		point.setY(50);
		
		point.show();
		
		
		Point point2 = new Point(200,200);
		point2.show();
		
		point.show(false);
		point2. show(false);
	
		Point point3 = new colorPoint();
		point3.setX(500);
		point3.setY(500);
		((colorPoint)point3).setColor("red"); //casting
		point3.show();
		
		
		Shape shape1 = new Triangle();
		Triangle triangle = (Triangle)shape1;
		triangle.draw();
		
		//객체가 Shape 클래스의 인스턴스인가?
		System.out.println(triangle instanceof Drawable);
		
	}
	


}
