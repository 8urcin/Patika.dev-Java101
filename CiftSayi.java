package patika.dev;

import java.util.Scanner;

public class CiftSayi {
	public static void main(String[]args) {
		int a, avg;
		int total = 0, sayi =0 ;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("How many numbers you want to check? : ");
		 a = input.nextInt();
		 
		 for (int i = 1; i<=a; i++) {
			 if(i%12==0) {
				 total = total+i;
				 sayi= sayi + 1;
				 
			 }
			 
		 }
		 avg= total/sayi;
		 System.out.println("Result: " + avg);
	}

}
