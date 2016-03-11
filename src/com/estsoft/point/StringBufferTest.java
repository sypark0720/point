package com.estsoft.point;

public class StringBufferTest {

	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");
		//sb.append(100);
		System.out.println(sb);
		
		sb.insert(7,  "my ");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("This");
		sb2.append(" is pencil").insert(7," my");//append의 리턴타입이 stringbuffer
		System.out.println(sb2);
	
		String s = "Hello"+1234+"world"; //내부적으로 아래 코드로 자동 변환.
		new StringBuffer("Hello").append(1234).append("world").toString();
	
	}
}
