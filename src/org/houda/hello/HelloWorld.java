package org.houda.hello;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		sayText("Bonjour tout le monde");
		Person p1= new Person("Abdel", 48, "masculin");
		Person p2 = new Person("Houda",40,"féminin");
		Familly f1= new Familly("Ben Aoun",7,p1);
		Familly f2 = new Familly("Ben Abdallah",11,p2);
		myList.add(f1.prenomFammilly);
		myList.add(f2.prenomFammilly);
//		System.out.println(f1.nomberPerson);
//		System.out.println(f2.nomberPerson);
		System.out.println(myList);
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
