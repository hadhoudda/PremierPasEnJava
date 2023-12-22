package org.houda.hello;

public class TestSwitch {

	public static void main(String[] args) {
		int value = (int)(Math.random()*10); // donne un valeur entre 0 et 9 ==  0≤ value ≤9
		// on utilise switch sur:entier, enum,string et caracter
//		switch (value) {
//		case 0:
//			System.out.println("zéro");
//			break;
//		case 1:
//			System.out.println("un");
//			break;
//		case 2: //beacoup des case 
//		case 3:
//		case 4:
//			System.out.println("entre deux et quatre");
//			break;
//		default:
//			System.out.println("autre");
//			break;
//		}
		////////// Nouvelle syntaxe de switch////////////////
		switch (value) {
		case 0-> System.out.println("zéro");
		case 1-> System.out.println("un");
		case 2,3,4-> System.out.println("entre deux et quatre");
		default-> System.out.println("autre");
		}
		
	}

}
