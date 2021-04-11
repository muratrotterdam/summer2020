package day15methodcreation;

public class MethodCreation01Parametreli {
	
	// parametreli metod icine deger girdigimiz bir metoddur..
	
	public static void Selamlama(String isim) {	
		System.out.println("Merhaba "+isim);
	}
	
	public static void toplama(int a, int b) {
		System.out.println(a+b);
	}
	public static void cikarma(int a, int b) {
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args) {
		
		Selamlama("Murat");
		toplama(3,5);
		toplama(4,8);
		cikarma(7,9);
		toplama(8,19);
	}

}
