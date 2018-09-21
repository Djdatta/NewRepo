package com.datta.imp;

import com.datta.basic.Parent;

//import com.datta.basic.*;		//can access classes inside the package


public class A {

	
	public void method1(){
		
		System.out.println("A--method1");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Parent parent=new Parent();
		
		com.datta.basic.Child child1=new com.datta.basic.Child();		//can create object in this way also with full package name.
		
		//child1.test();
		
		parent.parent1();
		
		
	}
}
