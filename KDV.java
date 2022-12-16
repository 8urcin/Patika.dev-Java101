package patika.dev;

import java.util.Scanner;

public class KDV {
	public static void main(String[]args) {
		
		double rate, money;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the amount of fee: ");
		money = input.nextDouble();
		System.out.println("enter the amount of VAT rate (0,20): ");
		rate = input.nextDouble();
		
		double vat =+ rate*money;
		System.out.println("Amount of VAT:  "+ vat);
		double vat1 = vat+money;
		System.out.println("Price with VAT:  "+ vat1);
		
	}
		
		
	
}
