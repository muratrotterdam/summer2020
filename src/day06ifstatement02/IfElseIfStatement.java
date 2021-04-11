package day06ifstatement02;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
		//Kullanicidan sinav notunu girmesini isteyin
		//negatif girerse yanlis girdiniz desin
		//50 den asagi ise kaldiniz yazdirin
		//80 den kucuk ise gectiniz desin 
		//80 dahil buyuk ise ekrana aferim yazdirin 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen notunuzu giriniz");
		
		int not = scan.nextInt();
		
		if(not<0) {
			
		
			System.out.println("Yanlis girdiniz");
		
		}else if(not<50) {
			System.out.println("Kaldiniz");
			
		}else if(not<=80) {
			System.out.println("Gectiniz");
		}else if(not<=100) {
			System.out.println("Aferim");
		}else
			System.out.println("Yanlis");
scan.close();
	}

}
