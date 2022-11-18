
package com.xworkz.programs.codingQuestion;

public class FrqOfCharacters {

	public static void main(String[] args) {
		String str = "swatiaaa";
		str.toLowerCase();
		int[] freq = new int[str.length()];
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					freq[i]++;
					ch[j] = '0';
				}
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (ch[i] != ' ' && ch[i] != '0') {
				System.out.println(ch[i] + " " + freq[i]);
			}
		}

	}
}
