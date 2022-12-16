package patika.dev;

import java.util.Scanner;

public class Burc {
	public static void main(String[]args) {
		
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Doğduğunuz ayı sayı şeklinde giriniz:");
		a = input.nextInt();
		System.out.println("Doğduğunuz günü sayı şeklinde giriniz:");
		b = input.nextInt();
		
		
		
		if(a==2&& b<20 || a==1 && b>=22) {
			System.out.println("Burcunuz Kova.");
			
		}
		else if(a==3&& b<20 || a==2 && b>=20) {
			System.out.println("Burcunuz Balık.");
			
		}
	
		else if(a==4&& b<21 || a==3 && b>=21) {
			System.out.println("Burcunuz Koç.");
			
		}
		else if(a==5&& b<22 || a==4 && b>=21) {
			System.out.println("Burcunuz Boğa.");
			
		}
		else if(a == 6 && b<23 || a==5 && b>=22) {
			System.out.println("Burcunuz İkizler.");
			
		}
		else if(a == 7 && b<23 || a==6 && b>=23) {
			System.out.println("Burcunuz Yengeç.");
			
		}
		else if(a == 8 && b<23 || a==7 && b>=23) {
			System.out.println("Burcunuz Aslan.");
			
		}
		else if(a == 9 && b<23 || a==8 && b>=23) {
			System.out.println("Burcunuz Başak.");
			
		}
		else if(a == 10 && b<23 || a==9 && b>=23) {
			System.out.println("Burcunuz Terazi.");
			
		}
		else if(a == 11 && b<22 || a==10 && b>=23) {
			System.out.println("Burcunuz Akrep.");
			
		}
		else if(a==12&& b<22 || a==11 && b>=22) {
			System.out.println("Burcunuz Yay.");
			
		}
		else if(a == 1 && b<22 || a==12 && b>=22) {
			System.out.println("Burcunuz Oğlak.");
			
		}
		else {
			System.out.println("Pllease try again!");
		}
		
		
	}

}
