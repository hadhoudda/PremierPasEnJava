package org.houda.hello;

public class TestParams {
	
	public static int add(int ... values) { //nouvel parametre pour accepte tableau et valeurs
		int accumulator =0;
		for (int val : values) {
			accumulator += val;
		}
		return accumulator;
	}
	
	public static void main(String[] args) {
		System.out.println(add());
		System.out.println(add(3,5));
		System.out.println(add(new int[] {5,8,6}));
		System.out.println(add(4,6,8));
		

	}

}
