package patika.dev;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[]args) {
		
		
		int num1, num2;
		char select;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please neter a value for the first number: ");
		num1 = input.nextInt();
		
		System.out.println("Please neter a value for the second number: ");
		num2 = input.nextInt();
	
		System.out.println("Please choose +, -, /, * : ");
		select = input.next().charAt(0);
		
		
		if (select == '+') {
			System.out.println("Result: "+ (num1+num2));
		}
		else if (select == '-') {
			System.out.println("Result: "+ (num1-num2));
		}
		else if (select == '/') {
			System.out.println("Result: "+ (1.0*num1/num2*1.0));
		}
		else {
			System.out.println("Result: "+ (1.0*num1*num2));
		}
}
		
	
}
