package org.houda.hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		Map<String, Integer> mapPersons=new HashMap<String, Integer>();
		mapPersons.put("Selsabil",15);
		mapPersons.put("Sajed",14);
		mapPersons.put("Yassin",10);
		mapPersons.put("Assil",9);
		mapPersons.put("Aymen",3);
		mapPersons.put("Houda",40);
		mapPersons.put("Jawad",48);
		for(Map.Entry <String, Integer> entry : mapPersons.entrySet()) {
			printEntry(entry);
		}
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
	//afficher les entres de map
		static void printEntry(Map.Entry entry) {
				System.out.println(entry.getKey()+"-->"+entry.getValue());
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
