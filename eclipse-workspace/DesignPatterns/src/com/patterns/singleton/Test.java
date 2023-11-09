package com.patterns.singleton;

public class Test {

	public static void main(String[] args) {
		
		SingleTon sn = SingleTon.getInstance();
		SingleTon sn2 = SingleTon.getInstance();
		SingleTon sn3 = SingleTon.getInstance();
		SingleTon sn4 = SingleTon.getInstance();

		System.out.println(sn.hashCode());
		System.out.println(sn2.hashCode());
		System.out.println(sn3.hashCode());
         System.out.println(sn4.hashCode());

	}
	
	  
}
