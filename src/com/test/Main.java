package com.test;

public class Main {

	public static void main(String args[]){
		System.out.println("Bonjour le monde");
		
		StructureList structureListIns=new StructureList();
		for (int i=0;i<10;i++){
			structureListIns.add(i);
		}
		
		System.out.println("--Begining of displaying the result in simple way--");
		structureListIns.get();
		System.out.println("---Begining of displaying the result with Iterator--");
		structureListIns.getWithIterrator();
	}
}
