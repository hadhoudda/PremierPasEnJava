package org.houda.hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TypeEnum {
	// Pour permettre la saisie à partir de la console
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	// ctrl + shift + o == importe les import necessaires
	public static void main(String[] args) throws Exception {
		Color color1 = Color.VERT;
		Color color2 = Color.ORANGE;
		Color color3 = Color.ROUGE;
		System.out.println("choisir votre couleur :");
		String action = keyboard.readLine();

		if (action.equals("VERT")) {
			System.out.println("votre chois est :" + color1);
		} else if (action.equals("ORANGE")) {
			System.out.println("votre chois est :" + color2);
		} else if (action.equals("ROUGE")) {
			System.out.println("votre chois est :" + color3);
		} else {
			System.out.println("n'existe pas");

		}
	}

}
