package org.houda.hello;

public class HelloWorld {

	public static void main(String[] args) {
		sayText("Bonjour tout le monde");

	}
	
	private static void sayText(String text) {
		text = text.toUpperCase();	
		/*
		int length = text.length();
		 * System.out.println(text);
		System.out.println("le nombre de caracters dans '" + text + " ' est:"+length);
		*/
		System.out.println(text);
		System.out.println("l'heure est :");
		System.out.println(java.time.LocalTime.now());
	}

}
