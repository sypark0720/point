package com.estsoft.point;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다음의 실행결과와 같이 출력하는 프로그램을 작성하세요.
//
//		“aBcAbCabcABC” 문자열 String 객체를 생성한다.
//		3번째 문자열 출력한다,
//		“abc”문자열이 처음으로 나타나는 인덱스를 추적한다.
//		위 문자열의 문자 개수를 출력한다.
//		‘a’를 ‘R’로 대체한 결과를 출력한다.
//		“abc”문자열을 “123’문자열로 대체한 결과를 출력한다.
//		처음 3개의 문자열만을 출력한다.
//		문자열을 모두 대문자로 변경하여 출력한다.
		
		String s = "aBcAbCabcABC";
		
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.length());
		System.out.println(s.replaceAll("a", "R"));;
		System.out.println(s.substring(5));

		String s1=" abc";
		String s2 = ",efg";
		
		s1 = s1.concat(s2);
		System.out.println("---"+s1+"---");
		
		String[] a = s1.split(",");
		for(String tok:a){
			System.out.println(tok);
		}
		
		
		char[] ca = s1.toCharArray();
		System.out.println(ca);
		
		System.out.println(s1.toUpperCase());
	}

}
