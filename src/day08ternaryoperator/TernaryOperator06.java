package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alalim cift ise 10 a bolunuyor mu kontrol edelim
		// Bolunuyorsa "Wooow 10" yazdiriniz.
		// Bolunmuyorsa "Yazik 10" yazdiralim
		// Sayi tek ise 5 e bolunuyor mu kontrol edelim
		// Sayi bolunuyorsa "Wooow 5" yazdiralim
		// bolunmuyorsa "yazik 5" yazak
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int num = scan.nextInt();
		
		String result = (num%2==0) ? (num%10==0 ? "Wooow 10" : "Yazik 10") : (num%5==0 ? "Wooow 5" : "Yazik 5");
		System.out.println(result);
		scan.close();

	}

}
