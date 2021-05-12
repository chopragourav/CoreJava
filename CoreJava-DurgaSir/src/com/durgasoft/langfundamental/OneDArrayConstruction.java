package com.durgasoft.langfundamental;

public class OneDArrayConstruction {

	public static void main(String[] args) {
		short[] s=new short[1];
		byte[] b=new byte[0];
		int[] i=new int[3];
		long[] l=new long[1];
		double[] d=new double[2];
		float[] f=new float[3];
		byte b1=20;
		int[] i1=new int[b1];
		int[] i2=new int[2147483646];
		boolean[] B=new  boolean[2];	
		System.out.println(s.getClass().getName()); 
		System.out.println(b.getClass().getName()); 
		System.out.println(i.getClass().getName()); 
		System.out.println(l.getClass().getName()); 
		System.out.println(d.getClass().getName()); 
		System.out.println(f.getClass().getName()); 
		System.out.println(B.getClass().getName()); 

	}

}
