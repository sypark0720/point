package com.estsoft.point;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		System.out.println(i);
		
		Integer i2 = new Integer("1000");
		System.out.println(i2);
		
		Integer i3 = 10; //new Integer 안 해도 자동으로 호출해준다.
		//Integer i3 = new Integer(10); //Boxing
		System.out.println(i3);
		
		int i4 = i3+100;
		//int i4 = i3.initValue()+100;
		System.out.println(i4);
		
		//literal pool
		Integer i10 = 100;
		Integer i20 = 100;
		
		System.out.println(i10==i20);
		
	    Integer j = new Integer( 10 );
	    Character c = new Character( '4' );
	    Double d = new Double( 3.1234566 );
	    System.out.println( Character.toLowerCase('A')); // 대문자 A를 소문자로 변환
	    
	    if(Character.isDigit( c )){ //문자 c 가 숫자를 나타내면
	       System.out.println( Character.getNumericValue( c ) ); // 문자를 숫자로 변환   
	    }
	    
	    System.out.println( Integer.parseInt( "-123" ) ); // 문자열을 정수로 변환
	    System.out.println( Integer.parseInt( "10", 16 ) ); // 16진수 문자열을 정수로 변환
	    
	    System.out.println( Integer.toBinaryString( 28 ) ); // 2진수로 표현된 문자열로 변환
//	    System.out.println( Integer.bitCount( 28 ) ); // 2진수에서 1의 개수
//	    System.out.println( Integer.toOctalString( "28" ) ); // 16진수 문자열로 변환   
//	    System.out.println( j.doubleValue() ); //  정수를 double로 변환   
//	    System.out.println( d.toString() ); // Double을 문자열로 변환   
	    System.out.println( Double.parseDouble("44.13e-16" )); // 문자열을 double로 변환   

	}

}
