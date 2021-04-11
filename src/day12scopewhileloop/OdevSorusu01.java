package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// Kullanicidan yasadigi ulkenin ismini alin bu ulkenin bastan ikinci ve sondan ikinci harfini buyuk harf yapin..eski odev
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yasadiginiz ukeyi giriniz");
		String ulke = scan.nextLine();
		
		System.out.println(ulke.toUpperCase().charAt(1)); // ikinci harfin indexi 1 dir
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
		
        scan.close();
	}

}
