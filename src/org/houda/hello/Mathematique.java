package org.houda.hello;

public class Mathematique {
	public static int min(final int a,final int b) {//final signefie que a et b on ne peut pas le modifier à l'interieur de fonction
		return a<b ? a : b;
	}
	public static int max(int a, int b) {
		return a>b ? a : b;
	}
	public static void main(String[] args) {
		System.out.println("le min de (3 ,7) == " + min(3,7)); //normalement on ecrit Mathematique.min(3, 7)
		System.out.println("le min de (34 ,23) == " + Mathematique.min(34,23));
		System.out.println("le max de (8 ,17) == " + max(8,17));//normalement on ecrit Mathematique.max(8,17)
		System.out.println("le min de (12 ,45) == " + Mathematique.max(12,45));

	}

}
