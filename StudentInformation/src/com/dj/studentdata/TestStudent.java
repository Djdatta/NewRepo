package com.dj.studentdata;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student(1, "Datta", "A");
		
		student.printData();
		
		student.setName("Rahul");
		
		student.setRoll_no(2);
		
		student.setDivision("B");
		
		student.printData();
		
	}

}
