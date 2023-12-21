package org.houda.hello;

public class TestSwitch {

	public static void main(String[] args) {
		int value = (int)(Math.random()*10); // donne un valeur entre 0 et 9 ==  0≤ value ≤9
		// on ne peut pas de faire switch au float ou double ou objet (pour string oui on peut)
		switch (value) {
		case 0:
			System.out.println("zéro");
			break;
		case 1:
			System.out.println("un");
			break;
		case 2: //beacoup des case 
		case 3:
		case 4:
			System.out.println("entre deux et quatre");
			break;
		default:
			System.out.println("autre");
			break;
		}
	}

}
