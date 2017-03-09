package com.demo;

public class OuterClass {
	public static final int pub = 1;
	public static final int stat = 2;
	public static final int fin = 3;
	
	private class InnerClass{
		void test(){
			
		}
		
	}
	
	public void dmm(){
		InnerClass innr = new InnerClass();
	}

}
