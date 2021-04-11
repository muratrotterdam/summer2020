package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
		//Kullanicidan bir tamsayi alalim..o sayinin mutlak degerini yazdirin..
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int abslt = scan.nextInt();
		
		if(abslt>0) {
			System.out.println(abslt*1);
		}else
			System.out.println(abslt*(-1));
scan.close();
	}

}
