package day06ifstatement;

import java.util.Scanner;

public class fStatement03Odev {

	public static void main(String[] args) {
       // Bir int variable olustur. Deger ata..eger cift ise ekrana cift yazsin tek ise tek yazsin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Cift");
		}
		
		if(num%2!=0) {
			System.out.println("Tek");
			scan.close();
		}
		
		
		
	}

}
