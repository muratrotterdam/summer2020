package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		
		// Kullanicidan bir character girmesini isteyiniz.
		// Char harf ise kucuk olup olmadigini kontrol ediniz
		// kucuk harf ise ekrana kucuk harf yazdiriniz
		// buyuk harf ise ekrana buyuk harf yazdiriniz
		// harf degil ise ekrana harf degil yazdiriniz
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz");
		
		char ch = scan.next().charAt(0);
		
		String result =  ((ch<=122 && ch>=97) || (ch>=65 && ch<=90)) ? (ch<=122 && ch>=97) ? "Kucuk Harf" : "Buyuk Harf" : "Harf Degil";
        System.out.println(result);	
        scan.close();
	}

}
