package com.xworkz.programs.codingQuestion;

public class RemoveSpaceInString {
	public static void main(String[] args) {
		String str = " welcome to java  ";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println(count);
		String s = str.replaceAll("\\s", "");
		System.out.println(s);
	}
}
