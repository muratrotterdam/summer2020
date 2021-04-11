package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Bugunun tarihini ekrana yazdiralim.
		
		System.out.println(LocalDate.now());  // tarih
		
		// saati yazdiralim
		System.out.println(LocalTime.now());  // saat
		
		// her ikisini de yazdiralim
		System.out.println(LocalDateTime.now()); //Herikisi de 		

	}

}
