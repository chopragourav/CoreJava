package com.durgasoft.langfundamental;

public class InstanceVariable {

	int x=10;
	public static void main(String[] args) {
		//System.out.println(x);
		InstanceVariable iv=new InstanceVariable();
		System.out.println(iv.x);
		m();
	}
	public static void m() {
	//	System.out.println(x);
	}
}
