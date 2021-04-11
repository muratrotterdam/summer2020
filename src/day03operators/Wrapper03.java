package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {  //Kullanicidan ad soyad al ekrana yazdir
											  //Kullanicidan adres al yazdir
											  //Kullanicidan yasini alin ve yazdirin
											  //Turkiye de yasiyorum.True False
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String isim= scan.nextLine();
		System.out.println(isim);
		
		System.out.println("Lutfen adresinizi giriniz");
		
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		byte yas = scan.nextByte();
		System.out.println(yas);
		
		System.out.println("trDeYasiyorum. true/false");
		
		boolean trDeYasiyorum = scan.nextBoolean();
		System.out.println(trDeYasiyorum);
		
		scan.close();
		
		

	}

}
