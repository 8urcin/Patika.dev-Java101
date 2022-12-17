package patika.dev;

import java.util.Scanner;

public class Faktöriyel {
	public static void main(String[]args) {
		//n!= 1*2*3*n
		System.out.println("Please enter a value for the number you want to calculate factorial:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int total =1 ;
		for(int i=1; i<=number;i++) {
			total= total*i; 
		}
		System.out.println(total);
		scan.close();
	}

}
