package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// Kullanicida iki sayi 
		// Esit ise toplamlarini ekrana yazdirin
		// Farkli ise carpimlarini ekrana yazdirin 
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lutfen bir sayi daha giriniz");
		int num2 = scan.nextInt();
		
		int sonuc = num1==num2 ? num1+num2 : num1*num2;
		
		System.out.println(sonuc);
		scan.close();

	}

}
