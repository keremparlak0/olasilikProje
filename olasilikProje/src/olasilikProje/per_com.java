package olasilikProje;

import java.util.Scanner;

public class per_com {
	
	public static int faktoriyel(int sayi) {
		int faktoriyel = 1;
        for(int i = 1; i<= sayi; i++){
            faktoriyel = faktoriyel * i;
        }
		
		return faktoriyel;
	}
	
	public static void permutasyon(int n, int r) {
		int perm;
		
		perm = faktoriyel(n) / faktoriyel(n-r);
		System.out.println("Girdiðiniz "+ n +" sayýsýnýn "+ r +" ile permütasyonu = " + perm);
		
	}
	public static int permutasyon1(int n, int r) {
		int perm;
		
		perm = faktoriyel(n) / faktoriyel(n-r);
		return perm;
	}
	public static void kombinsayon(int n, int r) {
		int komb;
		
		komb = permutasyon1(n,r) /faktoriyel(r);
		System.out.println("Girdiðiniz "+ n +" sayýsýnýn "+ r +" ile kombinasyonu = " + komb);
		
	}

	public per_com() {
		System.out.println("-------------------2-------------------");
		Scanner scanner = new Scanner(System.in);
		int n, r;
		
		System.out.print("Permütasyon ve kombinasyon hesaplanacak kümenin eleman sayýsýný giriniz: ");
		n = scanner.nextInt();
		
		System.out.print("\nKümeden seçilecek gruplarýn eleman sayýsýný giriniz: ");
		r = scanner.nextInt();
		
		
		//Permütasyon
		permutasyon(n,r);
		
		//Kombinasyon
		kombinsayon(n,r);
	}

}
