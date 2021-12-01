package com.anonymous;

public class C {
	public static void main(String[] args) {
		eatable e1=new eatable () {

			@Override
			public void eat() {
            System.out.println("nice eatable things");				
			}
			
		};
		e1.eat();
	}


}
