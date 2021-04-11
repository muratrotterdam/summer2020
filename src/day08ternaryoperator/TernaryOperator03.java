package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alini ve kucuk olani ekrana yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen ikinciyi sayiyi giriniz");
		
		int num2 = scan.nextInt();
		
		int result = num1>num2 ? num2 : num1;
		System.out.println(result);

			scan.close();
	}

}
