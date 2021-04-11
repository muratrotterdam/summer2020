package day04operators;

import java.util.Scanner;

public class InterwievSorusu01 {

	public static void main(String[] args) {
	
		//Iki tane variablesin degerlerini yer degistiriniz.
		//sayi=12, sayi2=30,==> oyle bir kod yaz ki calistiginda sayi1=30, sayi2=12 oldu buna da swap denir 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yerlerini degistirmek icin iki sayi giriniz");
		
		double sayi1= scan.nextDouble();
		
		double sayi2= scan.nextDouble();
		
		
		
		//1. yol
		System.out.println("Yer degismeden once");
		double gecici = 0.0;
		
		gecici=sayi1;
		
		sayi1 = sayi2;
		
		sayi2= gecici;
		
		System.out.println("Yer degistikten sonra");
		System.out.println(sayi1);

		System.out.println(sayi2);
		
		System.out.println("Yer degistirmek icin iki sayi daha giriniz");
		
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		
		sayi3= sayi3 + sayi4;
		sayi4= sayi3 - sayi4;
		
		sayi3= sayi3 - sayi4;
		
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		scan.close();
		
		

	}

}
