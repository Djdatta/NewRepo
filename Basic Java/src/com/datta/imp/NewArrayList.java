package com.datta.imp;

import java.util.ArrayList;
import java.util.Iterator;

public class NewArrayList {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList=new ArrayList<>();
	
		arrayList.add("Datta");
		arrayList.add("Datta");
		arrayList.add("Datta");

		arrayList.removeAll(arrayList);
		
		arrayList.add("Datta");
		arrayList.add("Datta");
		arrayList.add("Datta");
		arrayList.add("Datta");
		
		Iterator<String> iterator=arrayList.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		for(String list:arrayList){
			System.out.println("Using for loop ="+list);
		}
		
	}
	
}
