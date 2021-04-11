package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date manipulation==> date uzerinde degisiklikler yapmak
		
		
		// Tarihe 1 gun ekledik yarinin tarihini verdi
		LocalDate date = LocalDate.now();  // Obje olusturduk
		
		
		System.out.println(date.plusDays(1));  // 1 gun ekledim
		
		System.out.println(date.plusMonths(2));  // 1 ay ekledim
		
		System.out.println(date.plusDays(12));  // 12 gun ekledim ay degisti
		
		System.out.println(date.plusYears(2));  // 2 yil ekledim
		
		
		
		System.out.println(date.minusDays(3));  // 3 gun geriye gittik date.minus metodu ile
		
		System.out.println(date.minusMonths(2));  // 2 ay geri gittim
		

	}

}
