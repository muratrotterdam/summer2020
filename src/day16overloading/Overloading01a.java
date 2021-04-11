package day16overloading;

public class Overloading01a {

	public static void toplama(int a,int b,int c) {
		System.out.println("sonuc = "+(a+b+c));
	}
	public static void toplama(int a,int b) {
		System.out.println("sonuc = "+(a+b));
	}
	public static void toplama(String a, String b) {
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
	
		toplama(2,5,9);
		toplama(3,7);
		toplama("Murat","Doganci");
		
		
		

	}

}
