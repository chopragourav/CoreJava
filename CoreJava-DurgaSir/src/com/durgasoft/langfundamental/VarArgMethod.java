package com.durgasoft.langfundamental;

public class VarArgMethod {
	public static void sum(int... x) {
		int total=0;
		for(int y:x)
			total=total+y;
		System.out.println("Sum is: "+total);
	}
	public static void main(String[] args) {
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
	}
}
