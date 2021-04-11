package day17constructors;

public class Constructors01 {  // constructors main metodun ustunde olusturulur
	String isim= "Ali Can";
	int yas = 33;
	
   // Method ile mein mathod ayni clasin icindeyse sadece methodun ismini yazmak yeterli
	
	public static void main(String[] args) {
		buyume(33);
		isimDegistir("Murat");

	}
	
	// constructorsun metodlari ise mainin altina yazilir
	
	public static void buyume(int yas) {
		
		yas++;
		System.out.println(yas);
	}
    
	public static void isimDegistir(String isim) {
		System.out.println(isim);
		
	}
}
