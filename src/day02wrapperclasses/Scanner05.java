package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {
	
	//Dairenin alani ve cevresini hesaplama

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);     
		
		System.out.println("yari cap giriniz");
		
		double yariCap = scan.nextDouble();    //data tipini kusurlu oldugu icin double sectik dolayisiyla nexdouble oldu
		
		
		System.out.println(3.14159*yariCap*yariCap);
		
		System.out.println(2*3.14159*yariCap);
		
		
scan.close();
	}

}
