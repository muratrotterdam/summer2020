package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// For Each Loop , for loopun ust versiyonudur. Diger adi "Enhanced For Loop"dur.
		
		int arr[] = {12,21,13,43};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for each method  genellikle w kullaniriz
		
		for(int w:arr) {
			System.out.println(w);
		}
		
		
		// String iceren bir array olusturun. Elemanlarinin yanyana aralarina bosluk koyarak for each loop ile yazdirin
		
		String str[] = {"Ali", "Can", "Mahmut"};
		
		for(String w:str) {
			System.out.print(w + " ");
		}
		
		// integer elemanlar iceren bir list olusturun for each loop bu elemanlarin toplamini ekrana yazdiralim
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		
		int sum = 0;
		
		for(int w:list) {
			sum=sum+w;
		}System.out.println(sum);
		
		// {{1,2],{5},{6,7,8}} arrayda ki tum elemanlarin toplamini bulunuz
		
		int arr2[][] = {{1,2},{5},{6,7,8}};
		int sum1=0;
		for(int[] w : arr2 ) {
			for(int z:w) {
			sum1=sum1+z;	
			}
		}
		
		System.out.println(sum1);
		
		
		

	}

}
