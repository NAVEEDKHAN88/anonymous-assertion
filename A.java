package com.assertion;

public class A {
	public static void main(String[] args) {
		int age=14;
		assert age<=18:"cannot vote";
		System.out.println("the voters age is "+age);
	}

}
