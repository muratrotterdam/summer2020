package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		//Kullanicidan 3 basamakli sayi alalim bu sayinin rakamlarinin toplamini veren kod yazalim
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Lutfen 3 basamakli tam sayi giriniz");
		
		//int s = scan.nextInt();
				
		//int sonRakam = s%10;
		//int ilkRakam = s/100;
		//int araRakam1 = s/10;
		//int araRakam = araRakam1%10;	
		
		//System.out.println(sonRakam+ilkRakam+araRakam);
		
		System.out.println("Lutfen 4 basamakli tam sayi giriniz");
		
		int m = scan.nextInt();
		
		int birler = m%10;
		int onlar1 = m/10;
		int onlar = onlar1%10;
		int yuzler1 = m/100;
		int yuzler = yuzler1%10;
		int binler = m/1000;
		
		System.out.println(birler+onlar+yuzler+binler);
	
		scan.close();

	}

}
