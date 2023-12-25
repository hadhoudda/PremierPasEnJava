package org.houda.hello;

public class TestRecrusivite {
	
	public static long fact(long num) {
		if(num==0 || num==1) return 1;
		return num*(fact(num-1)); //recrusivite
	}
	/*
	 *  le recrusivite n'est pas toujour bon 
	 *  si ona beacoup de repetition le code mort
	 *  exemple avec fac(50000)
	 */
	public static void main(String[] args) {
		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(5));
		System.out.println(fact(6));

	}

}
