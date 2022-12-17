package patika.dev;

public class AsalSayi {
	public static void main(String[] args) {
		System.out.println("Asal sayılar: ");
		
		
		for(int a = 0; a<=100; a++) {
			boolean asal = true;
			for(int sayi = 2; sayi<a; sayi++) {
				if(a%sayi==0) {
					asal = false;
					
				}
				
			}
			if(asal && a!=0 && a!=1) {
				System.out.print(a+",");
			}
	}

}
}
