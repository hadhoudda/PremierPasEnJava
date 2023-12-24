package org.houda.hello;

public class TimeExcute {

	public static void main(String[] args) {
		int a = 6;
		long being = System.currentTimeMillis();
		for (int i=0; i<100; i++) {
			System.out.println(6*9);
		}
		long end = System.currentTimeMillis();
		System.out.println("durée :" + (end - being)+ " ms");//afficher le temps d'excution

	}

}
