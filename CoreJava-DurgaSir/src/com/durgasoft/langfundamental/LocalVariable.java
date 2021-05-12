package com.durgasoft.langfundamental;

public class LocalVariable {

	static int x=10;
	public static void main(String[] args) {
		System.out.println(x);
		m();
	}
	public static void m() {
		System.out.println(x);
	}
}
