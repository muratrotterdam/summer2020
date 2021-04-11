package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// do-while ile while loop farki==> oyun 
		// Kullanicidan sayi ver sayi 10 dan kucuk ise ekrana "WIN" yazalim
		// Sayi 10 veya daha buyukse ekrana thele bir sayi ver gardas yazalim
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		do {
			
		
		System.out.println("Hele bir sayi ver gardas");
		num=scan.nextInt();
		}
		while(num>=10);
			System.out.println("gazandin la");
		
		
		
		
scan.close();
	}

}
