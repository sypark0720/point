package com.estsoft.point;

import com.estsoft.paint.i.Drawable;

public class colorPoint extends Point implements Drawable {
	private String color;
	
	//기본생성자
	public colorPoint(){	
	}
	//생성자
	public colorPoint(int x, int y, String color){
		super(x,y); //부모 생성자 호출
		this.color = color; //this(color)는 쓸 수 없음.-> 이 코드 앞에 다른 코드가 올 수 없음.
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		//super.show(); //부모꺼 갖다 쓰는 것
		System.out.println("x&y:"+getX()+getY());
	}

	@Override
	public void draw() {
		System.out.println("draw point");
	}
	
	
}
