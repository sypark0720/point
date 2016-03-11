package com.estsoft.shape;

public abstract class Shape {//인스턴스화 되지 못한다. abstract method가 있는 게 abstract class
	
	//field
	private String fillColor;
	private String lineColor;
	
	//getter setter
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
//	//method
//    public void draw(){
//    	System.out.println("cannot draw");
	
	//public abstract void draw(); //추상 메소드
    
	
//넓이 계산
	//public abstract double calcArea();//부모에 있는 추상메소드는 자식이 반드시 구현해주어야 한다. 
	
}
