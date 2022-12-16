package patika.dev;
import java.util.Scanner;

public class NoOrtalamasi {
	public static void main(String[]args) {
		
		int mat, fizik, kimya, tarih;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik sınavı notunuzu girin: ");
		mat = input.nextInt();
		System.out.println("Fizik sınavı notunuzu girin: ");
		fizik = input.nextInt();
		System.out.println("Kimya sınavı notunuzu girin: ");
		kimya = input.nextInt();
		System.out.println("Tarih sınavı notunuzu girin: ");
		tarih = input.nextInt();
		
		double result = (mat+fizik+kimya+tarih)/4;
		System.out.println("Ortalamanız: "+ result);
		
		boolean passed = result >60;
		String situation = passed ? "Geçtiniz" : "Kaldınız";
		System.out.print(situation);
			
	}

}
