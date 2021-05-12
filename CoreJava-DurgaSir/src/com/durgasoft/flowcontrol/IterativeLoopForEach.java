package com.durgasoft.flowcontrol;

public class IterativeLoopForEach {

	public static void main(String[] args) {
		//Simple for loop
		System.out.println("1-D Array");
		int x[]= {10,20,30,40};
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
		
		System.out.println("==============================");
		
		//enhanced for loop/for-each loop
		int a[]= {10,20,30,40};
		for(int i:a)
			System.out.println(i);
		
		System.out.println("2-D Array");
		int x1[][]= {{10,20,30,40},{50,60}};
		for(int i=0;i<x1.length;i++)
			for(int j=0;j<x1[i].length;j++)
			System.out.println(x1[i][j]);
		
		System.out.println("==============================");
		
		//enhanced for loop/for-each loop
		int a1[][]= {{10,20,30,40},{50,60}};
		for(int[] i:a1)
			for(int j:i)
			System.out.println(j);
	}

}
