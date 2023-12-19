package org.houda.hello;

public class MyArrays {

	public static void main(String[] args) {
//*************** taille de tableau est fixe
		int [] firstArrays = new int[3]; //declaration de tableau vide contient 3 valeurs
		int [] secondArrays = {48,40,16,14,11,9,3};
		String [] stringArrays = {"houda","ben abdallah"};
		
//		for(int value: firstArrays) { //on ecrit for et on clique ctrl + espace =>foreach
//			System.out.println(value);
//		}
		for(int value: secondArrays) {
			System.out.println(value);
		}
		for (String string : stringArrays) {
			System.out.println(string);
			System.out.println(string.toUpperCase());
		}
		System.out.println("le nombre des arguments de tableau args est : " + args.length);
//		on peut ajoute des argument on clique à droit de souris + Run As + Run configuration
		for (String string : args) {
			System.out.println(string); 
		}

	}

}
