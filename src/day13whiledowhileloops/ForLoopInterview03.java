package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		// tersini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayi giriniz");
		String num = scan.next();
		
		for(int i= num.length()-1; i>=0; i--) {
			System.out.print(num.charAt(i));
		}
		
		
		
		scan.close();
	}

}
