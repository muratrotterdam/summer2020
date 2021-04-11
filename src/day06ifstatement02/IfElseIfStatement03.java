package day06ifstatement02;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		// Kullanicidan 6 basamakli bir sayi alalim..0 ile baslayabilir
		// kazanma ihtimali %20, amorti ihtimali %50, kaybetme ihtimali %50 olan bir oyunu icin kod yazalim
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("6 basamakli bir sayi giriniz");
		
		int num = scan.nextInt();
		
		if(num<200000) {
			System.out.println("Kazandiniz");
		}else if(num<500000) {
			System.out.println("Amorti");
		}else {
			System.out.println("Kaybettiniz");
			scan.close();
		}
		
		

	}

}
