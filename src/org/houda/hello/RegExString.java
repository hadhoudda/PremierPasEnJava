package org.houda.hello;

public class RegExString {

	public static void main(String[] args) {
		String myPhone = "06 22 46 44 54";
		System.out.println(myPhone.replaceAll("\\d", "x"));
		System.out.println(myPhone.replaceFirst("\\d\\d", "xx"));
		System.out.println(myPhone.replaceFirst("\\d\\d\s\\d\\d", "xxxx"));//\s le seperateur ne compte pas
	}

}
