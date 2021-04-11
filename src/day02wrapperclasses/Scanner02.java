package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		                          //Karenin bir kenar uzunlugunu giriniz.
				                  //Karenin cevresini ve alanini ekrana yazdiralim.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin bir kenarini giriniz");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println();
		
		System.out.println(kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu );
		
		System.out.println(kenarUzunlugu * kenarUzunlugu);
		
		
		scan.close();
		

	}

}
