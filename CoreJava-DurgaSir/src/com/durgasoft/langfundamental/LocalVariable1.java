package com.durgasoft.langfundamental;

public class LocalVariable1 {

	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		LocalVariable1 lv1=new LocalVariable1();
		lv1.x=222;
		lv1.y=333;
		System.out.println(lv1.x+" "+lv1.y);
		LocalVariable1 lv2=new LocalVariable1();
		System.out.println(lv2.x+" "+lv2.y);
	}
}
