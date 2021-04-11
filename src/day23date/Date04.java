package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirme
		
		LocalDate date = LocalDate.now();  // obje urettik
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //MMM dersek yazi ile ay yazar
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf1.format(date));
		
		// Time formatini degistirmek..
		
		LocalTime time = LocalTime.now();  // obje olusturdum
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm"); // buyuk HH yaparsak 24 luk saat dilimini verir
		System.out.println(dtf2.format(time));
		
		//Baska ulkenin local zamanini almak??
		
		
		
		
		
	}

}
