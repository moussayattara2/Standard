package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class StructureList {
	
	ArrayList<Integer> maliste=new ArrayList<>();

	public void add(Integer s){
		maliste.add(s);
	}
	public Integer get(){
		
		for (int i=0; i<maliste.size();i++){
			System.out.println(maliste.get(i));

		}
		return null;
	}
	
	public Integer getWithIterrator(){
		Iterator<Integer> it=maliste.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		return null;
	}
}
