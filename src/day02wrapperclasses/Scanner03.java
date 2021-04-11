package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
		//Odev==> Kullanicidan alinan bir sayinin kupunu hesaplayan kodu yazalim..
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir sayinin kupunu hesaplamak icin sayi giriniz");
		
		int sayininKupu = scan.nextInt();
		
		System.out.println(sayininKupu * sayininKupu * sayininKupu);
		
		scan.close();

	}

}
