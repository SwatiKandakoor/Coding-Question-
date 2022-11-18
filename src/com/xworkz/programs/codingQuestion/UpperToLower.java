package com.xworkz.programs.codingQuestion;

public class UpperToLower {
	public static void main(String[] args) {
		String str = "MANGO banana";
		StringBuilder builder = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				builder.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if (Character.isUpperCase(str.charAt(i))) {
				builder.setCharAt(i,Character.toLowerCase(str.charAt(i)));
		}
		}
		System.out.println(builder);
	}
}
