package org.hello;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		AA a1 = new AA();
		a1.i = 5;
		a1.j=6;
		
		//AA b1 = new AA();

		AA b1 = (AA) a1.clone();
		
		//b1 = a1;
		//b1.i = a1.i;
		//b1.j = a1.j;
		
		System.out.println(a1.i);
		a1.i =10;
		System.out.println(a1.i);
		System.out.println(b1.i);
	}
}


class AA implements Cloneable {
	int i;
	int j;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}