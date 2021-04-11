package day15methodcreation;

public class MethodCreation01a {

	
	// metod olusturma islemi mainin ustunde yapilir ve mainin icinden cagirilir bu sekilde bir kere olusturdugumuz metodu
	// bir cok kez kullanabiliriz..ve baska classdan cagiramayiz kesinlikle..
	
	public static void Selamlama() {
		System.out.println("Merhaba nasilsiniz?");
		System.out.println("Yavas yavas iyi olacagiz");
		System.out.println("Siz nasilsiniz");
	}
		static void Cevaplama() {
		System.out.println("Yorgun bir hayat");
		System.out.println("Java candir");
	}
	    static void islem() {
		System.out.println(3+5);
	}
	
	
	public static void main(String[] args) {
		
		Selamlama();
		Cevaplama();
		islem();
		islem();
		islem();
	}

}
