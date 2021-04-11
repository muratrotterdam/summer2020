package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// time manipulation (Zamani degistirmek)
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		System.out.println(time.plusMinutes(5));
		
		System.out.println(time.plusHours(3));
		
		System.out.println(time.minusHours(4));
		
		System.out.println(time.minusMinutes(28));
		
		System.out.println(time.plusSeconds(59));
		
		System.out.println(time.minusSeconds(11));

	}

}
