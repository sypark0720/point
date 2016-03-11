package com.estsoft.shape;

import com.estsoft.paint.i.Drawable;

public class Triangle extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("draw triangle");
	}
	
	

}
