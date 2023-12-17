package org.houda.hello;

public class ExempleStringBuffer {
		public static void main(String[] args) {
			StringBuffer buffer = new StringBuffer("bonjour ");
			buffer.append("tout ");
			buffer.append("le monde ");
			String text = buffer.toString();
			System.out.println(text);
			
			StringBuilder builder = new StringBuilder("stringbuilder ");
			builder.append("est ");
			builder.append("plus rapide ");
			builder.append("que stringbuffer");
			String text2 = builder.toString();
			System.out.println(text2);
			
			String text3 = "bonjour "+ "tout ";
			System.out.println(text3);
			/*
			 * on peut utilise le 3 concatunation precedants
			 * StringBuffer et StringBuilder sont utilisés surtout en boucle
			 */
		

		}

	}
