package day06ifstatement02;

import java.util.Scanner;

public class IfElseOdev {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı alın..
		//Eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana  “Rakam” yazdırın.
		//Diğer durumlarda ekrana “Sayı” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num = scan.nextInt();
		
		if(num>=0 && num<10) {
			System.out.println("Rakam");
			
		}else
			System.out.println("Sayi");
		scan.close();
	}

}
