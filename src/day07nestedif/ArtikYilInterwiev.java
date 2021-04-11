package day07nestedif;

import java.util.Scanner;

public class ArtikYilInterwiev {

	public static void main(String[] args) {
		// Kullanicidan yil girmesini isteyin.Girilen yil artik yil ise ekrana artil yil yazdirin.
		//girilen yil artik yil degil ise artik yil degil yazdirin
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen yil giriniz");
		int yil = scan.nextInt();
		
		if(yil%100==0 && yil%400==0) {
			System.out.println(yil + " artik Yildir");
		}else if(yil%100!=0 && yil%4==0) {
			System.out.println(yil + " artik yildir");
		}else
			System.out.println(yil + " artik yil degildir");
		scan.close();
		
		
		// artik yil 1) 100 e bolunurse 400 e de bolunmeli..2) 100 e bolunmezse 4 e bolunmeli

	}

}
