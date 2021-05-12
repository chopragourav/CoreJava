package com.durgasoft.flowcontrol;

public class TransferStatement {

	public static void main(String[] args) {
		// break
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("=============");

		// continue
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}

}
