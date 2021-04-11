package day06ifstatement;

import java.util.Scanner;

public class IfStatement06 {

	public static void main(String[] args) {
	
		// Kullanicidan bir dikdortgenin en ve boyunu alin.
		// en ve boy esit ise ekrana bu bir karedir yazdirin
		// en ve boy farkli ise bu bir dikdortgendir yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ekrana en ve boy giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		if(en==boy) {
			System.out.println("Bu bir karedir");
			
		}
		
		if(en!=boy) {
			System.out.println("Bu bir dikdortgendir");
			scan.close();
		}
		
		
		

	}

}
