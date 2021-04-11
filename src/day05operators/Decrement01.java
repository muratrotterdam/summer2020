package day05operators;

public class Decrement01 {

	public static void main(String[] args) {
		// int data tipinde bir variable olusturun ve bunun degerini 3 yontemle her defasinda 1 azaltin
		
		int num1= 12;
			num1= num1-1;			//uzun yol
		System.out.println(num1);	
		
		num1-= 1;
		System.out.println(num1);		//orta yol
		
		num1--;
		System.out.println(num1);		//en kisa yol
		

	}

}
