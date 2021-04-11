package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ucgende cevre bulmak icin uc sayi giriniz.");
		
		int sayi1 = scan.nextByte();
		int sayi2 = scan.nextByte();
		int sayi3 = scan.nextByte();
		
		System.out.println(sayi1+sayi2+sayi3);
		
		scan.close();
		
	}

}
