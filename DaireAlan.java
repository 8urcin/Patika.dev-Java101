package patika.dev;

import java.util.Scanner;

public class DaireAlan {
	public static void main(String[]args) {
		
		int r;
		double pi = 3.14;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a value for r :  ");
		r = input.nextInt();
		double alan= pi*r*r;
		double cevre = 2*pi*r;
		System.out.println("Circumference of the circle:  "+ cevre);
		System.out.println("Area of a circle:  "+ alan);
	}

}
