package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// Kullanicidan Paswoord girmesini isteyin.
		// dogru ise ekrana Password dogru yazdirin
		// yanlis ise password yanlis tekrar deneyin yazdiridin
		//Dogru password Java2020
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Luften Password giriniz");
		
		String pass = scan.next();
		
		if(pass.equals("Java2020")) {    //Stringin esitligini kontrol ederken == yerine .equals kullanmaliyiz
										 //Cunku equals sadece degerleri kontrol eder adresi kontrol etmez
			System.out.println("Pass dogru");
		}else
			System.out.println("Lutfen tekrar deneyiniz");
scan.close();
	}

}
