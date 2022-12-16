package patika.dev;

import java.util.Scanner;

public class ÜslüSayi {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int num,k,i;
		int result = 1;
		System.out.println("Enter a value: ");
		num = input.nextInt();
		System.out.println("Enter a value for exponential: ");
		k = input.nextInt();
		
		for(i =1;i<=k; i++) {
			result *= num;
			
			
		}
		System.out.println(result);
	}
	
}
