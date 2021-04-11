package day15methodcreation;

import java.util.Scanner;

public class MethodCreation01aa {
	
	static void hesaplamalar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kisa kenar giriniz");
		int kisa = scan.nextInt();
		System.out.println("Uzun kenar giriniz");
		int uzun = scan.nextInt();
		
		int alan = kisa*uzun;
		int cevre = 2*(kisa+uzun);
		
		System.out.println(alan);
		System.out.println(cevre);
		scan.close();
		
	}
	

	public static void main(String[] args) {
		
		hesaplamalar();
		hesaplamalar();

	}

}
