package com.xworkz.programs.codingQuestion;

public class NoOfVowelsAndConsonants {
	public static void main(String[] args) {
		String name = "What is your name";
		int vowels = 0;
		int consonants = 0;
		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vowels++;
			} else if (name.charAt(i) >= 'b' && name.charAt(i) <= 'z') {
				consonants++;
				System.out.println("consonants :" + consonants + ":" + name.charAt(i));
			}

		}
		System.out.println("vowels :" + vowels);
		System.out.println("consonants :" + consonants);
	}

}
