package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		// Ternary Operator (if-else-if)
		// Kullanicidan bir sayi aliniz.
	    // Sayo 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz
		// 10 dan kucuk ise ekrana rakam yazdiriniz
		// degilse pozitif sayi yazdiriniz
		// Sayi 0 dan kucukse ekrana negatif sayi yazdiriniz.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		double num = scan.nextDouble();
		
		String result = num>=0 ? (num<10 ? "Rakam" : "Pozitif sayi") : "Negatif sayi";
			System.out.println(result);
			scan.close();

	}

}
