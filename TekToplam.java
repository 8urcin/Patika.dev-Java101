package patika.dev;

import java.util.Scanner;

public class TekToplam {
	public static void main(String[] args)
	{
		System.out.println("Please enter a value: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int total = 0;
		for ( int a= 0 ; a<=n; a++) {
			
			if(a%2==1) {
				
				total = total + a;
			
			}
			
			input.close();
		}
		System.out.println("Total of all odd numbers: "+ total);
	}
	
}
