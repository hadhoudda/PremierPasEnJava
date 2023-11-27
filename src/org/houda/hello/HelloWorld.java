package org.houda.hello;

public class HelloWorld {

	public static void main(String[] args) {
		String text = "Bonjour tout le monde";
		text = text.toUpperCase();	
		int length = text.length();
		System.out.println(text);
		System.out.println("le nombre de caracters dans '" + text + " ' est:"+length);

	}

}
