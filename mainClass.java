package olasilikProje;

import java.util.Scanner;

public class mainClass {
	public static void standartSapma(int [] dizi) {
		
		double ort = 0;
		int toplam = 0;
		for(int i = 0; i < dizi.length; i++) 
			toplam+=dizi[i];
		
		
		ort = (double)toplam/dizi.length;
		
		double kareToplam = 0, standartSapma; 
	 	for (int i = 0; i < dizi.length; i++){ 
	 		kareToplam = kareToplam + dizi[i] * dizi[i]; 			
	 		//Formül ile standart sapma bulma iþlemi
	 	} 
	 	standartSapma = Math.sqrt(kareToplam / dizi.length - ort*ort);
	 	System.out.println("Standart Sapma= " + standartSapma);

}
	
	
	public static void mod(int [] dizi) {
		int tepe = 1;
		int enTepe = 1;
		int mod = 0;
		for(int i=1; i<dizi.length; i++){
			if(dizi[i] == dizi[i-1]) {
				tepe++;
			}
			else {
				if(tepe > enTepe) {
					enTepe = tepe;
					mod = dizi[i-1];
				}
				tepe = 1;
			}
		}
		System.out.println("Mod(Tepe Deðeri)= "+ mod);
	}
	
	
	public static void medyan(int [] dizi) {
		if(dizi.length % 2 == 1) {
			int tekliSira = (dizi.length + 1) / 2;
            System.out.println("Medyan= "+dizi[tekliSira - 1]);
		}
		else if(dizi.length % 2 == 0){
			double ikiliSira = dizi.length / 2.0;
            double ortaSayi = (dizi[(int) ikiliSira - 1] + dizi[(int) ikiliSira]) / 2.0;
            System.out.println("Medyan= "+ortaSayi);
		}
	}
	
	
	public static void harmonikOrt(int[] dizi) {
        double harOrt = 0.0;
        for(int i =0;i<dizi.length;i++) 
        	harOrt += 1.0/dizi[i];
        
        harOrt = dizi.length/harOrt;
        
        System.out.println("Harmonik Ortalama= " + harOrt);
	}
	
	
	public static void geometrikOrt(int [] dizi)
	
    {
        double geoOrt = 1 ;
        
        for (int i = 0; i < dizi.length; i++)
        	geoOrt *= dizi[i];
        
        
        geoOrt = Math.pow(geoOrt, (1.0/dizi.length));
        
        System.out.println("Geometrik Ortalama= "+ geoOrt );
        
    }
	
	public static void aritmetikOrt(int [] dizi) {
		double ort = 0;
		int toplam = 0;
		for(int i = 0; i < dizi.length; i++) 
			toplam+=dizi[i];
		
		
		ort = (double)toplam/dizi.length;
		System.out.println("Aritmetik Ortalama = "+ ort);
	}
	
	public static int kup(int sayi) {
		return sayi*sayi*sayi;
		}
	
	public static void carpiklikOlcutu(int [] dizi, int ortDeger) {
		double carpOlc = 0;
		int payKismi = 0;
		
		
		for(int i = 0; i<dizi.length; i++) 
			payKismi += (kup(dizi[i] - ortDeger));
			
		
		carpOlc = payKismi/(dizi.length-1);
		System.out.println("Çarpýklýk Ölçütü= " + carpOlc);
		}
	
	
	public static void sivrilikOlcutu(int [] dizi, int ortDeger) {
		double carpOlc = 0;
		int payKismi = 0;
		
		for(int i = 0; i<dizi.length; i++) 
			payKismi += (uzeriDort(dizi[i] - ortDeger));
		
		carpOlc = payKismi/(dizi.length-1);
		System.out.println("Sivrilik Ölçütü= " + carpOlc);
		}
		
	public static int uzeriDort(int sayi) {
		return sayi*sayi*sayi*sayi;
		}
		
	public static void ortDeger(int [] dizi) {
		int toplam = 0;
		int ortDeger = 0;
		 
		for(int i = 0 ; i< dizi.length ; i++) {
			toplam = toplam + dizi[i];
		}

		ortDeger = toplam/ dizi.length;
		carpiklikOlcutu(dizi, ortDeger);
		sivrilikOlcutu(dizi, ortDeger);
	}

	public static void main(String[] args) {
		int [] dizi;
		int temp = 0;
		int elemanSayisi = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Eleman sayýsýný giriniz: ");
		elemanSayisi = scanner.nextInt();
		dizi = new int[elemanSayisi];
		
		//Girilen sayýlarýn diziye atamasý
		for(int i = 0; i<elemanSayisi; i++) {
			System.out.print((i+1)+". sayýyý giriniz: ");
			dizi[i] = scanner.nextInt();
		}
		
		//Dizinin sýralý biçime döüþtürülmesi
		for(int i = 0; i < dizi.length; i++)
        {
            for(int j = i+1; j < dizi.length; j++){
                if(dizi[j] < dizi[i]) {
                	temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
		System.out.print("Sayý diziniz: ");
		for (int element: dizi) {
            System.out.print( + element + " ");
        }
		System.out.println("\n");
				
		//Mod
		mod(dizi);
		
		//Medyan
		medyan(dizi);
		
		
		//Aritmetik ort
		aritmetikOrt(dizi);
		
		//Geometrik Ortalama
		geometrikOrt(dizi);
		
		//Harmonik Ortalama
		harmonikOrt(dizi);
		
		//Standart Sapma
		standartSapma(dizi);

		//Çarpýklýk Ölçütü
		//Sivrilik (basýklýk) Ölçütü
		ortDeger(dizi);
		}
}
