package com.estsoft.point;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point = new Point();
		
		//기본 오브젝트 구현 메서드 확인
		System.out.println(point);
		System.out.println(point.toString());
		System.out.println(point.hashCode());
		System.out.println(point.getClass().getName());
		
		//==와 equals의 차이점
		
		Point point2 = new Point(2,3);
		Point point3 = new Point(2,3);
		
		System.out.println(point2==point3); //참조값이므로
		
		System.out.println(point2.equals(point3));
		System.out.println(point2.hashCode() == point3.hashCode()); //원래는 해시값 비교 ->오버라이드:안에 내용이 같으면 같게
		System.out.println(point2.hashCode());
		System.out.println(point3.hashCode());
		System.out.println(System.identityHashCode(point2));
		System.out.println(System.identityHashCode(point3));
		
}

}
