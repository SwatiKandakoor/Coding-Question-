package com.xworkz.programs.codingQuestion;

public class FatherTwice {
	public static void main(String[] args) {
		float fatherAge = 46;
		float sonAge = 24;
		float x = 0;
		int count = 0;
		if ((fatherAge / sonAge) > 2) {
			while (x != 2) {

				System.out.println("------------");
				fatherAge++;
				System.out.println("father" + fatherAge);
				sonAge++;
				x = fatherAge / sonAge;
				System.out.println("son" + sonAge);
				System.out.println(x);
				count++;
			}
			System.out.println(count);
		} else if ((fatherAge / sonAge) < 2) {

			while (x != 2) {

				System.out.println("------------");
				fatherAge--;
				System.out.println("father" + fatherAge);
				sonAge--;
				x = fatherAge / sonAge;
				System.out.println("son" + sonAge);
				System.out.println(x);
				count++;
			}
			System.out.println(count);
		}
	}
}
