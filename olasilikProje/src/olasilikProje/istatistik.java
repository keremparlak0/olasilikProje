package olasilikProje;


import java.util.Scanner;

public class istatistik {
	

	public static void varyans(int[] dizi) {
		double varyans=0;
		
		
		//∑(xi-x̄)
		for(int i=0;i<dizi.length;i++) {
			varyans+=(((double)dizi[i]-aritmetikOrt1(dizi))*((double)dizi[i]-aritmetikOrt1(dizi)));
		}
		
		
		varyans = varyans/(dizi.length);
		System.out.println("Varyans= " + varyans);
		
	}
	
	public static void standartSapma(int [] dizi) {
		
		double ort = 0;
		int toplam = 0;
		for(int i = 0; i < dizi.length; i++) 
			toplam+=dizi[i];
		
		
		ort = (double)toplam/dizi.length;
		
		double kareToplam = 0, standartSapma; 
	 	for (int i = 0; i < dizi.length; i++){ 
	 		kareToplam = kareToplam + dizi[i] * dizi[i]; 			
	 		//Formül ile standart sapma bulma işlemi
	 	} 
	 	standartSapma = Math.sqrt(kareToplam / dizi.length - ort*ort);
	 	System.out.println("Standart Sapma= " + standartSapma);

}
	
	static void mod(int n,int dizi[],int dizi2[])
	   {
		int m=0,c;	
		for(int i=0;i<n;i++) 
		{   c=1;
	          if(dizi[i]==-1)
	           dizi2[i]=0;
	           else
	           {
	             for(int j=i+1;j<n;j++) 
		     {
			if(dizi[i]==dizi[j])
	                  {
	                      c++;
	                      dizi[j]=-1;
	                  }
	                   
			   }
	             dizi2[i]=c;
	            }           
	           if(i>=1)
		   {
			if(i==1)
			  m=dizi2[0];
		       if(dizi2[i]>=m)
	                  m=dizi2[i];   		 
		    }		
		}     
	        System.out.print("Mod: "); 
		 for(int i=0;i<n;i++) 
		{
		    if(dizi2[i]==m)
	              System.out.print(dizi[i]+" ");   
			
		}     	 
		System.out.println();
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
	
	static double aritmetikOrt1(int [] dizi) {
		double ort = 0;
		int toplam = 0;
		for(int i = 0; i < dizi.length; i++) 
			toplam+=dizi[i];
		ort = (double)toplam/dizi.length;
		return ort;
		
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
		System.out.println("Çarpıklık Ölçütü= " + carpOlc);
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
	//Constructor
	public istatistik() {
		System.out.println("-------------------1-------------------");
		Scanner scanner = new Scanner(System.in);
		int [] dizi;
		int [] dizi2;
		int temp = 0;
		int elemanSayisi = 0;
		
		
		System.out.print("\nEleman sayısını giriniz: ");
		elemanSayisi = scanner.nextInt();
		dizi = new int[elemanSayisi];
		dizi2 = new int[elemanSayisi];

		//Girilen sayıların diziye ataması
		for(int i = 0; i<elemanSayisi; i++) {
			System.out.print((i+1)+". sayıyı giriniz: ");
			dizi[i] = scanner.nextInt();
		}
		
		//Dizinin sıralı biçime döüştürülmesi
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
		System.out.print("Sayı diziniz: ");
		for (int element: dizi) {
            System.out.print( + element + " ");
        }
		System.out.println("\n");
				
		//Mod
		mod(dizi.length,dizi,dizi2);
		
		//Medyan
		medyan(dizi);
		
		
		//Aritmetik ort
		aritmetikOrt(dizi);
		
		//Geometrik Ortalama
		geometrikOrt(dizi);
		
		//Harmonik Ortalama
		harmonikOrt(dizi);
		
		//Varyans(Nüfus)
		varyans(dizi);
		
		//Standart Sapma
		standartSapma(dizi);

		//Çarpıklık Ölçütü
		//Sivrilik (basıklık) Ölçütü
		ortDeger(dizi);
	}

}
