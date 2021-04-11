package day02wrapperclasses;

import java.util.Scanner;

public class Scanner09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Luften saati saniye ye cevirmek icin sayi giriniz");
		
		Long saat=scan.nextLong();
		
		System.out.println(saat*60*60);
		
scan.close();
	}

}
