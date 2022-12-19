package patika.dev;

import java.util.Scanner;

public class Metottt {
	
	static int power(int num, int exp) {
		int result = 1;
		for(int i = 1; i <= exp; i++) {
			result = result * num;
			
		}
		
		return result ;
	}
	
	public static void main(String[] args) {
		int a, b;
		int ans1= power(2, 5);
		System.out.println(ans1);
		System.out.println("Please enter base: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		System.out.println("Please enter exponential: ");
		b = input.nextInt();
		int result1 = power(a,b);
		
		System.out.println(a+" to the power of "+ b + " is: "+result1);
		
		
	}
}
