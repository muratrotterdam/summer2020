package day15methodcreation;

public class MethodCreation01withreturn {
	
	// return kelime ile cikan sonucu surekli kullandik.. returnden sonra baska birsey yapilmaz..
	
	public static int uciletoplama(int a) {
		return a+3;
	}
	public static int besilecarp(int a) {
		return a*5;
	}
	public static int dortcikar(int a) {
		return a-4;
	}
	
	public static void main(String[] args) {
		
		System.out.println(dortcikar(besilecarp(uciletoplama(5))));

	}

}
