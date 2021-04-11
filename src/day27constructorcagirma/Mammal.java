package day27constructorcagirma;

public class Mammal extends Animal {

	public boolean dogum=true;
	
	public static void main(String[] args) {
		
		//Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal(15);
	}
	public void feed() {    // feed beslemek demek
		System.out.println("Cocuklarini besler..");
	}
	
	Mammal() {
		this(11); // Parentta ki parametresiz constructori cagir demektir.
				 // super() keywordunu kullanmasak da olur ama bazen gorebiliriz ayni seydir.
		         // super() kullanilacaksa mutlaka ilk satirda olmali
		System.out.println("Mammal parametresiz constructor");
	}
	Mammal(int age) {
		super();
		System.out.println("Mammal parametreli constructor");
	}
}


// this() ayni classdaki parametresiz constructoru cagirak icin kullanilir