package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// bir arrayin elemanlarini kucukten buyuge diziniz ve
		// ekrana 2 durumuda yazdiriniz
		
		int arr[] = {2,11,0,23,7};
		
		System.out.println(Arrays.toString(arr)); // eski hali
		
		Arrays.sort(arr); //Sort metoduna arrayin ismi yazilirsa kucukten buyuge siralanir
		
		System.out.println(Arrays.toString(arr)); // yeni hali

		char arr1[] = {'a','z','k','b'};  // duzeltelim
		
		Arrays.parallelSort(arr1);
		
		System.out.println(Arrays.toString(arr1));  // duzelttik
		
		String arr2[] = {"Murat", "Ali","Zehra"};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
	
	}
}
