package olasilikProje;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int secim;
		
		System.out.println("Yapmak istediğiniz hesaplama ve hesaplamalar için seçiminizi yapınız:\n\n");
		System.out.println("-Olasılık ve istatistiksel hesaplamalar için '1' e tıklayınız.\n");
		System.out.println("-Permütasyon ve Kombinasyon hesaplamaları için '2' e tıklayınız.\n");
		System.out.println("-Hipotez testi için '3' e tıklayınız.\n");
		
		System.out.print("Seçiminiz: ");
		secim = scanner.nextInt();
		
		
		if(secim == 1) {
			istatistik istatistik1 = new istatistik();
			istatistik1.getClass();
		}
		
		
		
		else if(secim == 2) {
			per_com per_com1 = new per_com();
			per_com1.getClass();
			
			
			
		}
		
		
		else if(secim == 3) {
			hipotezTesti hipotez_testi = new hipotezTesti();
			hipotez_testi.getClass();
			
			
		}
		else {
			System.out.println("Yanlış seçim yaptınız!");
		}
			
		}

}
