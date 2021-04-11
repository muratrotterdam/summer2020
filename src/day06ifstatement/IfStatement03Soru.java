package day06ifstatement;

import java.util.Scanner;

public class IfStatement03Soru {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı alın eğer tamsayı 3 ile bölünebiliyorsa ekrana “3’ün katı” yazdırın. 
		//3 ile bölünemiyorsa ekrana “3’ün katı değildir” yazdırın.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		
		int num = scan.nextInt();
		
		if(num%3==0) {
			System.out.println("3 un katidir");
		}else
			System.out.println("3 un kati degildir");
		
		scan.close();
		
		
		
	}

}
