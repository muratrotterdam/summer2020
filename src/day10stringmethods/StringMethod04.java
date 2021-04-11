package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains() methodu bir stringin icinde bir karakterin olup olmadiginiz kontrol eder eger o karakter varsa true
		// yoksa false return eder
		
		String str1 = "karakartal";
		
		System.out.println(str1.contains("kara"));
		
		
		// trim() bir stringde ki bas ve sonda ki bosluklari siler
		
		String str2 = "   Ali Can   ";
		System.out.println(str2.trim());
		
		// isempty() bir stringin icinde karakter olup olmadigina bakar. Karakter yoksa true varsa false return eder
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty());
		
		String str4 = "";
		System.out.println(str4.isEmpty());
		
		//isEmpty true cikarsa length 0 demektir
		
		
		
 
	}

}
