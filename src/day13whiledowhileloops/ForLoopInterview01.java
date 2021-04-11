package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		// Kullanicidan bir string alin ve onu tersten yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle/kelime giriniz");
		
		String str = scan.nextLine();
	// for loop ile	
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
			
	// while loop ile		
			int length = str.length()-1;
			while(length>=0) {
			System.out.print(str.charAt(length));	
			length--;
		}
		
scan.close();
	}

}
