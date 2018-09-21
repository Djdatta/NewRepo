package com.datta.basic;

public class Test extends Parent{

	public void test(){
		
		System.out.println("test---of---Test class");
	}
	
	
	public void parent1(){
		
		super.parent1();		//call Parent class parent1() method
		
		//System.out.println("parent1--of ---Test class");
	}
	public static void main(String[] args) {
		
		Test test=new Test();
		
		Parent p=new Parent();
		
		Child child=new Child();
		
		test.test();
		
		test.parent1();	
		
				
		p.parent1();
		
		p.parent2();
		
		
		child.parent1();
	}
	
}
