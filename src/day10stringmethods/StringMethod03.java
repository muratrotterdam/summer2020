package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
//		// charAt() metodu belli indexde ki karakteri return eder
//		
//		String str1= "cimbombom";
//		//str1 in 4.indexinde ki karakteri bulan kodu yaziniz.
//		
//		System.out.println(str1.charAt(4));  //indexi 4 olan karakteri istedi cvp o olmali..
//		
//		System.out.println(str1.charAt(0)); // 0 ilk index oldugunda c return eder
//
//		//Length() stringin icin de kac karakter oldugunu soyler
//		
//		System.out.println(str1.length());  // Ekrana 9 yazdirmali
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.next();
		
		int length = isim.length();
		System.out.println(isim.charAt(length-1));
		
		scan.close();
		
	}

}
