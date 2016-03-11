package com.estsoft.point;

import com.estsoft.paint.i.Drawable;

public class Point {
	private int x;
	private int y;

	// constructor
	public Point() {

	}

	// constructor-생성자 overloading
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	@Override
//	public String toString() {// 객체 안의 값을 확인하는 용도로 많이 쓰인다.
//		return "Point [x=" + x + ", y=" + y + "]";
//	}
	//equals와 hashCode
	@Override
	public int hashCode() {
		final int prime = 31; //java에서 이렇게 하도록 만들어 놓았다. 포인터와 연관된 해시코드값이 사라졋다...
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //참조값으로 비교
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //instanceof쓸 때의 문제: colorpoint도 들어올 수 있으므로 . 그러면 또 더 들어가서 봐야 하므로 성능이 더 안좋아진다.
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	//equals made
	public boolean equals2(Object obj) {//우리가 만든것
		if(obj ==null){//obj is not null
			return false;
		}
		
		if(obj instanceof Point == false){//obj should be instance of Point
			return false;
		}
		
		Point other = (Point)obj;
		
		return (x == other.getX() && y ==other.getY());
	}
	
	
	
	

}
