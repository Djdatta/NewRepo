package com.dj.studentdata;

public class Student {

	int roll_no;
	String name;
	String division;
	
	
	public Student(int roll_no, String name, String division){
		this.roll_no=roll_no;
		this.name=name;
		this.division=division;
		
	}

	
	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public void printData(){
		
		System.out.println("Name is "+name +" Roll No is "+roll_no +" and Divison is "+division);
	}
		
	
}
