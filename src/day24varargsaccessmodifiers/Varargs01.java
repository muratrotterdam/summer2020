package day24varargsaccessmodifiers;

public class Varargs01 {
	
	public static void main(String[] args) {
		// Varargs demek variable argument demek.. 
		// Bir metod olusturdugumuz da argument olarak istedigimiz kadar argument girebilmemizi saglar.
		
		countNum(4);
		countNum(4,7,9);
		countNum(4,7,9,12,14,41);
		
		sumNums(2,3,7,4,5.3);
		printName("Ali" , "Can");
	}

	public static void countNum(int... a) {
		System.out.println(a.length);
	}
	
	public static void sumNums(double... b) {
		double sum=0;
		for(double w: b) {
			sum=sum+w;
		System.out.println(sum);
		}
	}	
	public static void printName(String... n) {
		for(String w: n) {
			System.out.println(w);
		}
	}
		
		
	
}
