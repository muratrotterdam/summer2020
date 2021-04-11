package day06ifstatement;

import java.util.Scanner;

public class Ifstatement05OdevA {
	
	public static void main(String[] args) {
		
		//Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
		//“Pazar” ise ekrana  “Hıristiyanlar icin kutsal gün” yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz");
		
		String gun = scan.next();
		if(gun.equals("Cuma")) {
			System.out.println("Muslimanlar icin kutsal gundur");    }
		else if(gun.equals("Cumartesi")) {
		System.out.println("Yahudiler icin kutsal gundur"); 
		
				
			}else if(gun.equals("Pazar")) {
				System.out.println("Hiristiyanlar icin kutsal gundur");
			}else
				System.out.println("Insanlik icin kutsal gun");
			scan.close();	
		}
		
		
		
	}


