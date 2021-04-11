package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() metodu iki listin birbirinie esit olip olmadigini kontrol eder ve esit ise true degil ise false return eder.
		
		List<String> list1= new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2)); // false cunku elemanlar farkli
		
		list2.add("B");
		list1.add("A");
		System.out.println(list1.equals(list2)); // false verdi cunku ayni indexte ayni eleman var mi ona da bakiyo
		
		// demek ki equls() metodunun true vermesi icin hem eleman sayisi hemde yerleri ayni olmasi lazim yani fotokopi gibi
	}

}
