package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		// kullanicidan kac elemanli bir array girmesini isteyiniz
		// tum elemanlarini yazdirin
		// ilk elemani son eleman yapip yazdirin
		// mesela (1,2,3) ise (2,3,1) olacak
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kac elemanli bir array olusturmak istersiniz");
		
		int length = scan.nextInt();
		
		int arr[] = new int[length]; // kac elemanli olacagini uzunluktan girdik
		
		System.out.println("Array elemanlarini giriniz");
		
		for(int i=0; i<length; i++) {
			
			arr[i] = scan.nextInt();
			
		}
			System.out.println(Arrays.toString(arr));  // Arrays.toString metoduna arrayin ismini yazarsak tum elemanlarini ekrana verir.
			
			
			int arrSon[] = new int[length];
			
			for(int i = 1; i<length; i++) {
				arrSon[i-1] = arr[i];
			}
			arrSon[length-1] = arr[0];
			
			System.out.println(Arrays.toString(arrSon));
				scan.close();
			}
				
			
			
		
			
	}


