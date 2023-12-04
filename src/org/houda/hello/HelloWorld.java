package org.houda.hello;

public class HelloWorld {

	public static void main(String[] args) {
		sayText("Bonjour tout le monde");
		Person p1= new Person("Abdel", 48, "masculin");
		Familly f1= new Familly("Ben Aoun",7,p1);
		System.out.println(f1.nomberPerson);

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
	// declaration des class
	static class Familly {
		String prenomFammilly;
		int nomberPerson;
		Person person;
		public Familly(String prenomFammilly,int nomberPerson,Person person ) {
			this.prenomFammilly = prenomFammilly;
			this.nomberPerson = nomberPerson;
			this.person = person;
		}
	}
	static class Person{
		String name;
		int age;
		String gener;
		public Person(String name,int age,String gener){
			this.name = name;
			this.age = age;
			this.gener = gener;
		}
	}

}
