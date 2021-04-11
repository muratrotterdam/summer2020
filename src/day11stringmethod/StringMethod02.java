package day11stringmethod;

public class StringMethod02 {

	public static void main(String[] args) {
		// substring() methodu bir stringin belli bir bolumunu kesip  almak icin kullanir
		
		String str1 = "Java calisana kolaydir";
		
		//substring 1. versiyonu..
//		System.out.println(str1.substring(5)); //index e gore 5 den basliyoruz
//		System.out.println(str1.substring(8));  // indexe gore 8 den basliyoruz
//		System.out.println(str1.substring(23)); hata verir bu kadar index yok
		
		//substring 2. versiyonu..
		
		System.out.println(str1.substring(1, 4)); // ilk index dahil ikinci haric seklinde yazmaliyiz.
		System.out.println(str1.substring(6, 12));
		System.out.println(str1.substring(6, 6)); // ekranda hicbisey gorunmez ilk 6 a diyo diger 6 hayir dedi son diyen oldu
		
		
		
		

	}

}
