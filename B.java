package com.assertion;

import java.util.Scanner;

public class B {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter your age");
		int age =sc.nextInt();
		assert age >=18:"Not valid";
		System.out.println("the age is"+age);
		
	}

}
