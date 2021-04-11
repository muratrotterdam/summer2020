package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanici password girmesini isteyin
		// Password 4 basamakli bir sayi ise cift olup olmadigini kontrol edelim.
		// cift ise password tamam yazdiralim
		// Tek sayi ise tekrar deneyin yazdiralim
		// password 4 basamakli degil ise tekrar deneyiniz yazdiralim
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen sifrenizi giriniz");
		
		int sifre = scan.nextInt();
		
		if(sifre>999 && sifre<10000) {
			if(sifre%2==0) {
				System.out.println("tamam");
			}else if(sifre%2!=0) {
				System.out.println("tekrar deneyin");
			}
			}else {
				System.out.println("tekrar deneyiniz");
				
				
		} scan.close();
		

	} 

} 
