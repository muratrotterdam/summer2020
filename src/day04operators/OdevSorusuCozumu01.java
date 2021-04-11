package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		String yas = scan.nextLine();
		
		int yeniYas = Integer.parseInt(yas);
		
		System.out.println(yeniYas+1);
		
		System.out.println("Adinizi ve soyadiniz giriniz");
		
		String isim = scan.nextLine();
		
		System.out.println(isim);
		
		System.out.println();
scan.close();
	}

}
