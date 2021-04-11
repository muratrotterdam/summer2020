package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		//Kullanicinin verdigi 4 basamakli sayinin ilk ve son basamaginin toplamini veren kod yazin..
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli sayi giriniz");
		
		int s = scan.nextInt();
		
	    int sonRakam= s%10;  
	    
	    int ilkRakam= s/1000;
	    
	    System.out.println(sonRakam+ilkRakam);
	    
		
		
		scan.close();
		
		

	}

}
