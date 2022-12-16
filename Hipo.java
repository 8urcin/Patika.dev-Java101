package patika.dev;

import java.util.Scanner;

public class Hipo {
	public static void main(String[]args) {
		int a, b;
		double c;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a value for edge of triangle: ");
		a = input.nextInt();
		System.out.println("please enter another value for edge of triangle: ");
		b = input.nextInt();
		c = Math.sqrt(a*a+b*b);
		System.out.println("The hypotenuse of the triangle is "+ c);
		
	}

	
}
