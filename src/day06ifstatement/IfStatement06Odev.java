package day06ifstatement;

import java.util.Scanner;

public class IfStatement06Odev {

	public static void main(String[] args) {
		// Kullanıcıdan iki sayı alın eğer sayıların işaretleri  aynı ise ekrana “Aynı işaretli” yazdırın.
		// Sayıların işaretleri  farklı ise ekrana “Farklı işaretli” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tam sayi giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1<=0 && num2<=0 || num1>=0 && num2>=0) {
			System.out.println("Ayni isaretlidir");
		}
		if(num1<=0 && num2>=0 || num1>=0 && num2<=0){
			System.out.println("Zit isaretlidir");
			scan.close();
		}

	}

}
