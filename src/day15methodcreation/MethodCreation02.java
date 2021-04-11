package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// saati saniyeye ceviren, mili km ye, kg mi grama ceviren method yazinin
		// bu methodu mainin disinda yazip mainde cagiralim.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("birimi giriniz");
		String birim = scan.nextLine().toLowerCase();
		System.out.println("Miktari giriniz");
		Double miktar = scan.nextDouble();
		
		donusturucu(birim,miktar);
		scan.close();
	}
		public static void donusturucu(String birim, Double miktar) {
			switch(birim) {
			
			case "saat":
				System.out.println(miktar*60*60);
				break;
			case "mil":
				System.out.println(miktar*1.6);
				break;
			case "kg":
				System.out.println(miktar*1000);
				break;
			default :
				System.out.println("Baska birsey girmeyiniz");
			
			
		}
			
		
		

	}

}
