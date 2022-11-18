package com.xworkz.programs.codingQuestion;

public class MultipleNo {

	public static int function(char n, int b, int c) {

		if (n == '+') {
			return b + c;

		} else if (n == '-') {
			return b - c;
		}

		else if (n == '*') {
			return b * c;

		} else if (n == '/') {
			return b / c;
		}
		else {
			return 0;
			
		}
	}

	public static void main(String[] args) {
		char[] n = { '+', '-' ,'*','/','+','/'};
		int b=4;
		int c=2;
		for(int i=0;i<n.length;i++) {
	    int  x= function(n[i], b, c);
	     System.out.println(x);   
		}
		
		
	}

}
