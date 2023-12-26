package org.houda.hello;

import java.util.regex.Pattern;

public class TestValideMail {
	//********* 2éme methode plus pratique et preferable si on a une boucle *************//
	private static Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w]+\\.[a-z]{2,}$");
	private static Pattern datePattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)?([0-9]{2})$");
	
	public static boolean isValidMailSecond(String email) {
		return emailPattern.matcher(email).matches();
	}
	public static boolean isValidDateSecond(String date) {
		return datePattern.matcher(date).matches();
	}
	//********* 1er methode utilisable en cas pas de boucle *************//
	public static boolean isValidMail(String email) {
		//String RegEx = "^.+@.+\\..+$";
		/*
		 * ^ : commence d'expression
		 * .+ : n'importe quel caractere ou beacoup de caracteres sauf retour en ligne non
		 * @ : @
		 * \\. : signfie un point .
		 * $ : fin d'expression
		 */
		//String RegEx = "^[A-Za-z0-9._-]+@[A-Za-z0-9]+\\.[a-z]{2,}$";
		/*
		 * ^ : commence d'expression
		 * [A-Za-z0-9._-] : de A à Z, de a à z, de 0 à 9, . signefie ., - on le mert à la fin
		 * @ : @
		 * \\. : signfie un point .
		 * $ : fin d'expression
		 */
		String RegEx = "^[\\w.-]+@[\\w]+\\.[a-z]{2,}$";
		/*
		 * \\w : signfie tous les lettres majusculs et minusculs et les chiffres et _
		 */
		return email.matches(RegEx);
	}
	
	public static boolean isValidDate(String date) { //jj/mm/aaa ou jj/mm/aa
		//String RegEx = "^\\d\\d/\\d\\d/\\d\\d(\\d\\d)?$"; // (\\d\\d)? : signfie pas obligatoire
		String RegEx = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)?([0-9]{2})$";
		/*
		 * \\w : signfie tous les lettres majusculs et minusculs et les chiffres et _
		 */
		return date.matches(RegEx);
	}
	
	public static void main(String[] args) {
		System.out.println("-------validation email ---------");
		System.out.println(isValidMail("houda.com"));
		System.out.println(isValidMail("houda@gmail"));
		System.out.println(isValidMail("houda@gmail.com"));
		System.out.println("-------validation email second methode ---------");
		System.out.println(isValidMailSecond("houda.com"));
		System.out.println(isValidMailSecond("houda@gmail"));
		System.out.println(isValidMailSecond("houda@gmail.com"));
		System.out.println("-------validation date ---------");
		System.out.println(isValidDate("45/02/2025"));
		System.out.println(isValidDate("5/02/202"));
		System.out.println(isValidDate("25/02/2025"));
		System.out.println("-------validation date second methode ---------");
		System.out.println(isValidDateSecond("45/02/2025"));
		System.out.println(isValidDateSecond("5/02/202"));
		System.out.println(isValidDateSecond("25/02/2025"));

	}

}
