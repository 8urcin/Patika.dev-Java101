package patika.dev;

import java.util.Scanner;

public class Kitle {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int a;
		double b;
		System.out.println("Kilonuz: ");
		a = input.nextInt();
		System.out.println("Boyunuz: (metre cinsinden)");
		b = input.nextDouble();
		
		double result = a/(b*b);
		System.out.println("Vücut kitle ideksiniz: "+ result);
		
		input.close();
	}
		

}
