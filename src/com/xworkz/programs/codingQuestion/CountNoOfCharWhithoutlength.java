package com.xworkz.programs.codingQuestion;

public class CountNoOfCharWhithoutlength {
	public static void main(String[] args) {
		String name = "kavitha";
		int count = 0;
		for (char ch:name.toCharArray()) {

			count++;
		}
		System.out.println(count);

	}

}
