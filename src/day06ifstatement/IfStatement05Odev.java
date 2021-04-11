package day06ifstatement;

import java.util.Scanner;

public class IfStatement05Odev {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		// “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		
		String harf = scan.next();
		
		if(harf.equals("a") || harf.equals("e") || harf.equals("i") |harf.equals("o") || harf.equals("u")) {
			System.out.println("Sesli harf");
		}else if(harf.equals("b") || harf.equals("c") || harf.equals("d") || harf.equals("f")) {
			System.out.println("Sessiz harf");
		}else
			System.out.println("Error");

		scan.close();
	}

}
