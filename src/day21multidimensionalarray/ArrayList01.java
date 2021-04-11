package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> List01 = new ArrayList<>(); // array list boyle yazilir..
		
		//System.out.println(List01);  //Bos bir tepsi suan 
			
		List01.add("Ali");
		                       	// Liste eleman eklemek icin add methodu kullanilriz
		
		List01.add("Can");
		
		
		List01.add(1, "Veli");   // Araya isim girmesi icin add. uzantisina bakariz
		
		
		
		List01.add(0, "Han");
		
		
		List01.add(2, "Kemal");
		
		
		List01.add(5, "Ayse");
		
		System.out.println(List01);
		
		// List01 in eleman sayisini ekrana yazdiralim..size methodunu kullanacaz.
		
		System.out.println(List01.size());
				
		
		

	}

}
