package day02wrapperclasses;

import java.util.Scanner;

public class UcgendeAalan {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Lutfen iki tam sayi giriniz");
		
		short taban=scan.nextShort();
		short yukseklik=scan.nextShort();
		
		
		
		System.out.println((taban*yukseklik)/2);
scan.close();
	}

}
