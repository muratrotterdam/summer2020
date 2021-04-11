package day28overriding;

public class Mammal extends Animal {

	public boolean birth = true;
	
	public static void main(String[] args) {
		
		Mammal mammal = new Mammal();	
		
		
	}

	public void feed() {
		System.out.println("Yavrularini besler.");
	}
	
	public Mammal() {
		// this icinde bulundugunuz class da ki metodlara ulasmanizi saglar
		// chil-parent iliskisi varsa this kullanarak parent class da ki variable ve metodlara da ulasabiliriz.
		// genel kullanimda this class icindekiler icin super parenttekiler icin kullanilir.
		System.out.println(this.birth);
		this.feed();
		System.out.println(this.age);
		System.out.println(this.age);
		System.out.println(this.name);
		this.move();
		
		// parantezsiz super sadece baba ve dede deki variableye ve metoda ulasmamizi saglar
	}
	
}
