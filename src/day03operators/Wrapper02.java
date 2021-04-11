package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); //Kullanicidan ilk ismini alalim ekrana yazdiralim
											 //Kullanicidan soyismini alin ilk ismin altina yazdirin.
		
		System.out.println("Ilk isminini yazar misiniz");
		
		String isim= scan.nextLine();
		
	
		
		System.out.println("Soyisminizi yazar misiniz");
		
		String soyIsim= scan.nextLine();
		
		System.out.println(isim);
		System.out.println(soyIsim);
	
scan.close();
	}

}
