package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data tipinde 1 variable olustur ve bunu carpma ve bolme kullanarak arttirin ve azaltin.
		
		int num1 = 12;
		num1 = num1*5;
		System.out.println(num1);		//uzun yol carpma
		
		int num2 = 12;
		num2 = num2/4;
		System.out.println(num2);		//uzun yol bolme
		
		int num3 = 12;
		num3*=3;						//kisa yol carpma
		System.out.println(num3);
		
		int num4= 12;
		num4/=2;						//kisa yol bole
		System.out.println(num4);

	}

}
