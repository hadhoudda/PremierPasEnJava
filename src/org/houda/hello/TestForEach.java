package org.houda.hello;

import java.util.ArrayList;

public class TestForEach {

	public static void main(String[] args) {
		ArrayList<String> Language = new ArrayList<>();
		Language.add("HTML5");
		Language.add("CSS3");
		Language.add("Saas");
		Language.add("Javascript");
		Language.add("React.js");
		Language.add("Node.js");
		Language.add("Express.js");
		Language.add("Java SE");
		System.out.println("Mes compétences :");
		for (String lang: Language) {
			System.out.println(lang);
		}

	}

}
