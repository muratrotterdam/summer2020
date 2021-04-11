package day17constructors;

public class Constuctors02 {

	public static void main(String[] args) {
	// Claslar farkli ise farkli methodu burda kullanamam. "buyume" methodu burda kullanilamadi.
	// eger illa kullanmak istiyorsan ilk obje olusturmak lazim construction1 den 
		
		Constructors01 obj1 = new Constructors01();  // obje uretme boyle olur
		// buyume methodu static oldugundan java obj kullanarak buyume methodunu cagirmani istemez ve altini sari ile cizer
		
	//	obj1.buyume(33);
	//	obj1.isimDegistir("Murat baba");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		// bir variable veya method static olarak olusturulmussa o methoda object olusturmadan sadece clas ismini kullanarak olusturabilir
		System.out.println(Constructors03.ad);
		
		System.out.println(Constructors03.kilo);
		Constructors03.degistirme("Mahmut Halayci");
		Constructors01.buyume(42);
	}

}
