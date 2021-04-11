package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz.
		// Sayi pozitif veya 0 ise ekrana pozitif veya 0 yazdirin
		// Negatif ise ekrana negatif yazdirin 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		double num = scan.nextDouble();
		
		//if(num>=0) {
			//System.out.println("Pozitif veya 0");
		//}else
			//System.out.println("Negatif");
			
		String sonuc = num>=0 ? "Pozitif veya 0" : "Negatif";
		System.out.println(sonuc);
		scan.close();
	}

	
	
}  
