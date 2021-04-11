package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist02 {

	public static void main(String[] args) {
		// toArray() metodu list'i array'e cevirmek icin kullanilir.
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		
		System.out.println(list);
		
		// 1. yol
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		// 2. yol  object kullandik
		
		Object arr1[]= list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		//asList() metodu arrayleri liste cevirir
		
		String arr2[] = {"Aliye","Can"};
		
		List<String> list1 =Arrays.asList(arr2);
		System.out.println(list1);
		
		// Arrayden olusturulan list'e ekleme ve cikarma yapamayiz.
		// run time error verir: UnsupportedOperationException verir.
		
		
 		
	}

}
