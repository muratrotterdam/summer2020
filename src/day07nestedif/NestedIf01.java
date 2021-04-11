package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan sayi alin.
		// Bu sayi pozitif ise 9 dan buyuk mu diye kontrol edin, buyukse "sayi" yazdirin
		// 9 dan kucuk esit ve 0 dan buyuk esit ise ekrana "rakam" yazdirin.
		// negatif ise sayi yazdiralim.
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Bir tamsayi giriniz");
		int num = scan.nextInt();
		if(num>=0) {
			if(num>9) {
				System.out.println("Sayi");
			}else if(num<=9 && num>=0) {
				System.out.println("Rakam");
			}
		}else if(num<0) {
			System.out.println("Sayi");
		}
		
		
		scan.close();   // scanner classini kullandiktan sonra en altta main methodun icin de
		                // scan.close ile kapatalim

	}

}
