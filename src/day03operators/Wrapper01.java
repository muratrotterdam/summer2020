package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
				//kullanicidan ad soyad alip ekrana yazdirma programi yazalim
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adiniz ve soyadinizi giriniz");
		
		String isim = scan.nextLine();		//Stringleri kullanicidan almak icin ya next() yada nextLine() kullanilir
											//next() tek kelimeler icin nextLine() cok kelimelik stringler icin kullanilir.
		
		System.out.println(isim);
		
		scan.close();
		

	}

}
