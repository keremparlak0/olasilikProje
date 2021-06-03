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
		System.out.println("Girdi�iniz "+ n +" say�s�n�n "+ r +" ile perm�tasyonu = " + perm);
		
	}
	public static int permutasyon1(int n, int r) {
		int perm;
		
		perm = faktoriyel(n) / faktoriyel(n-r);
		return perm;
	}
	public static void kombinsayon(int n, int r) {
		int komb;
		
		komb = permutasyon1(n,r) /faktoriyel(r);
		System.out.println("Girdi�iniz "+ n +" say�s�n�n "+ r +" ile kombinasyonu = " + komb);
		
	}

	public per_com() {
		System.out.println("-------------------2-------------------");
		Scanner scanner = new Scanner(System.in);
		int n, r;
		
		System.out.print("Perm�tasyon ve kombinasyon hesaplanacak k�menin eleman say�s�n� giriniz: ");
		n = scanner.nextInt();
		
		System.out.print("\nK�meden se�ilecek gruplar�n eleman say�s�n� giriniz: ");
		r = scanner.nextInt();
		
		
		//Perm�tasyon
		permutasyon(n,r);
		
		//Kombinasyon
		kombinsayon(n,r);
	}

}
