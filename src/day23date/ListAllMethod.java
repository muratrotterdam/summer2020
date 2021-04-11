package day23date;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethod {

	public static void main(String[] args) {
		// addAll() metodu iki listi birlestirmeyi saglar.
		
		List<Integer> list1 = new ArrayList<>();  // ilk list
		
		list1.add(11);
		list1.add(12);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();  // ikinci list
		
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2);
		
		
		// simdi ikisini addAll metodu ile birlestirelim
		
		list1.addAll(list2);
		System.out.println(list1);
		
		list2.addAll(list1);
		System.out.println(list2);  // bir ustte list1 e list2 yi ekledigimiz icin burda list1 i uzun aldi 
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		System.out.println(list3);
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(2);
		list4.add(3);
		System.out.println(list4);
		
		
		list4.addAll(1, list3); // list4 de araya list 3 koyduk ikinci addAll metodu ile 
		System.out.println(list4);
		
		
		
		
		
		
		
		
		
		

	}

}
