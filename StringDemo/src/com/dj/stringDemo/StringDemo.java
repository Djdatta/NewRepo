package com.dj.stringDemo;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String s="Hello";
		
		String s1="Hello";
	
		String s2="NewObject";
		
		System.out.println(s1.concat(s2));
		System.out.println(s2);
		
		System.out.println(s);
		
		
		System.out.println(s.equals(s1));	//Yes-value is same
		
		System.out.println(s==s1);			//Yes-object is also same
		
		System.out.println(s.equals(s2));
		
		String string=new String("NewObject");
		
		System.out.println(string.equals(s2));	//Value is same
		
		System.out.println(string==s2);			//Object is different.
		
		StringBuffer buffer=new StringBuffer("HelloIndia");
		
		
		System.out.println(buffer.append("sdads"));
		System.out.println(string.substring(3));
		
		

	}
	
	
	
}
