package javaexamples;

import java.util.Scanner;

public class RelationalOpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a and b : ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("a > b : "+(a>b));
		System.out.println("a < b : "+(a<b));
		System.out.println("a >= b : "+(a>=b));
		System.out.println("a <= b : "+(a<=b));
		System.out.println("a != b : "+(a!=b));
	}

}
