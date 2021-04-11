package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		//Kullanicidan alacagi urun miktarini ve fiyatini alalim..eger kullanici 1000 den fazla urun alirsa yuzde 20 indirim yapalim.
		// kullanicinin odeyecegi toplam fiyati ekrana yazalim
		// 1000 veya az alirsa indirim yapmayan fiyat veren kod yazalim.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen alacaginiz urun adedini yaziniz");
		double urun= scan.nextDouble();
		
		System.out.println("Lutfen alacaginiz urun birim fiyatini giriniz");
		
		
		double birim = scan.nextDouble();
		
		if(urun>1000) {
			System.out.println(urun*birim*80/100);
		
		}else
			System.out.println(urun*birim);
		scan.close();
		}
		
		

	}


