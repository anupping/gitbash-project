package org.hello;

public class Hello {

	public static void main(String[] args) {
		
		Phello pl = new Phello();
		
		if(pl instanceof Permission) {
			pl.show();
		} else {
			System.out.println("No permission");
		}
		
	}
}

interface Permission {}

class Phello implements Permission {
	
	void show() {
		System.out.println("hello...");
	}
}