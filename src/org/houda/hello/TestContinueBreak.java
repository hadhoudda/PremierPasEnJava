package org.houda.hello;

public class TestContinueBreak {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==4) {
				continue; //on saute l'excution de boucle for quand i=4
			}
			System.out.println(i);
		}
		System.out.println("test continue");
		System.out.println("--------------------------");
		for (int i = 0; i < 10; i++) {
			if(i==4) {
				break; //on arrete l'excution de boucle for quand i=4
			}
			System.out.println(i);
		}
		System.out.println("test break");
		System.out.println("--------------------------");
		for (int i = 0; i < 10; i++) {
			if(i==4) {
				return; //on sort de l'excution de main quand i=4 et le reste de code n'excute pas
			}
			System.out.println(i);
		}
		System.out.println("test return");
		System.out.println("--------------------------");
	}

}
