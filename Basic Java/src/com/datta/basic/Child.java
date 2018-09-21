package com.datta.basic;

public class Child extends AbstractClass{

	public void parent1(){
		
		//super.parent1();		//call Parent class parent1() method-super keyword is used to call immedieatly parent class metho
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("child---m1()");
		
	}
	public static void main(String[] args) {
		AbstractClass abstractClass=new Child();
		
		abstractClass.m1();
	}
}
