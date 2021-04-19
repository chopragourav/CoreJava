package com.casio.calculator;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// Create Scanner obj
		Scanner sc=new Scanner((System.in));
		//read I/P from end user
		System.out.println("Enter Principe Amount : ");
		Float principle=sc.nextFloat();
		System.out.println("Enter Time in Days : ");
		Float time=sc.nextFloat();
		System.out.println("Enter Rate of Intrest : ");
		Float rate=sc.nextFloat();
		Float SI=0.0f;
		if(rate==1) {
			SI=(principle*time)/3000;
			System.out.println("Intrest is : "+SI);
		}else if (rate==1.25) {
			SI=(principle*time)/2400;
			System.out.println("Intrest is : "+SI);
		}else if (rate==1.5) {
			SI=(principle*time)/2000;
			System.out.println("Intrest is : "+SI);
		}else if (rate==1.75) {
			SI=(principle*time)/1714;
			System.out.println("Intrest is : "+SI);
		}else if (rate==1.90) {
			SI=(principle*time)/1577;
			System.out.println("Intrest is : "+SI);
		}else if (rate==2) {
			SI=(principle*time)/1500;
			System.out.println("Intrest is : "+SI);
		}else {
			SI=(principle*time)/1200;
			System.out.println("Intrest is : "+SI);
		}
	}
}
