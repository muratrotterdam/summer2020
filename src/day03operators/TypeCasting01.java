package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by1 =101;
		
		int sayi1= by1;  //Kucuk data tipini buyuk data tipine cevirmek icin extra kod yazmaya gerek yok java bunu otomatik yapar.
					   //Buna da AUTO WIDENING denir
	
		System.out.println(sayi1);
		
		int sayi2= 53;
		
		byte by2= (byte)sayi2;   // buyuk datayi kucuge koyarken basa parantez icine kucuk data yazilir (byte) gibi
		
		System.out.println(by2);
		
		double sayi3= 23.5;
		
		int by3= (int)sayi3;
		
		System.out.println(by3);
		
		float sayi4 = -23.9f;
		
		short by4 = (short)sayi4;
		System.out.println(by4);
		
		double sayi5= 4.8;
		double sayi6= 1.4;
		
		int sonuc=(int)(sayi5/sayi6);
		
		System.out.println(sonuc);
		
		int sayi7=5;
		int sayi8=3;
		
		int sonuc3=sayi7/sayi8;
		
		System.out.println(sonuc3);
		
		int sayi9= 255;      //ekran da -1 cikiyor cunku byte da 256 tane sayi var ama soru da ki sayi 255 oldugu icin -1 cikiyor
		byte by5= (byte) sayi9;
		
		System.out.println(by5);
		
		
		
		
		
		
		
		
		
		
		

	}

}
