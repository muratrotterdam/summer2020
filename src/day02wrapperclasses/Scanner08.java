package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Luften mil'i km ye cevirmek icin sayi giriniz.");
		
		double km= scan.nextDouble();
		
		System.out.println(km*1.6);
		
		scan.close();

	}

}
