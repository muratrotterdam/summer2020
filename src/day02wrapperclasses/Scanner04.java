package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		//dikdortgen alan ve cevresi hepalama
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("iki sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 * sayi2);
		
		System.out.println(2 * (sayi1 + sayi2));
		
		
scan.close();
	}

}
