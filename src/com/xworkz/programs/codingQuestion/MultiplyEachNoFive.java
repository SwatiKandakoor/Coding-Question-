package com.xworkz.programs.codingQuestion;

public class MultiplyEachNoFive {
	public static void main(String[] args) {
		int number=10;
		int temp=number;
		int mod=0;
		int count=0;
		int multi=0;
		while(number>0) {
			mod=number%10;
			number=number/10;
			count++;
		}
		//System.out.println(count);
		
		multi=temp*(int)Math.pow(5, count);
		System.out.println(multi);
	}

}
