package olasilikProje;


public class histogram {
	
	private void aciklik(int [] dizi) {
		int aciklik;
		
		aciklik = (dizi[dizi.length-1]- dizi[0])/dizi.length;
		aciklik++;
		System.out.println("Açýklýk= " + aciklik);
		histGrafik(aciklik,dizi);
		
	}
	
	private void histGrafik(int aciklik, int[] dizi) {
		System.out.println("\n\n-----------Histogram Grafiði-----------");
		for(int i = 0 ; i<dizi[dizi.length-1] ; i+=aciklik) {
			System.out.print(i+" - "+(i+aciklik)+":  ");
				for(int j=0 ; j< dizi.length ;j++) {
					if(dizi[j]>=i && dizi[j]<=(i + aciklik))
					{
						System.out.print(" *");
					}
				}
			System.out.println();
			i++;
		}
	}

	public histogram(int [] dizi) {
		aciklik(dizi);
		
		
		
		
	}
}