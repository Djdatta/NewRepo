package com.datta.imp;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		
	

		Student student=new Student(1, "dtta");
		
		Student student2= new Student(2, "rahul");
		
		
		
	java.util.ArrayList<Student> arrayList=new java.util.ArrayList<Student>();
	
	/*arrayList.add("datta");
	
	arrayList.add("jadhav");
	
	arrayList.add("12132");
	*/
	/*Iterator<String> itr= arrayList.iterator();
	
	while(itr.hasNext()){
		
		System.out.println(itr.next());
	}
		*/
	
	
	
	arrayList.add(student);
	
	arrayList.add(student2);
	
	
	Iterator<Student> itr=arrayList.iterator();
	
	while(itr.hasNext()){
		Student st=(Student)itr.next();		//typecast itr.next return Student object.
		
		System.out.println("Name is-"+st.name +" And roll no is-"+st.roll_no);
	}
	
	
	
	
		
	}
	
}
