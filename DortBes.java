package patika.dev;

import java.util.Scanner;

public class DortBes {
	public static void main(String[] args)
	{
		System.out.println("Please enter a value: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int a = 0; a <= n; a++) {
			switch(a%4) {
			case 0 :
				System.out.println(a+" is a multiple of 4.");
			
				
				
			}
			switch(a%5) {
			case 0 : 
				System.out.println(a+" is a multiple of 5.");
			}
		}
}
}