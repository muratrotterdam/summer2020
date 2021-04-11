package day27constructorcagirma;

public class Animal {
	
	public int age ;
	protected String name;
	
	public static void main(String[] args) {
		
	Animal animal = new Animal();
		
		
	}
	public void move() {   // bu metroddur return type var
		System.out.println("Haraket edebiliyor");
	}
	public void eat() {
		System.out.println("Yemek yer");
	}
	
	Animal() {  // bu constructordur return type yok 
		System.out.println("Animal parametresiz constructor");
	}

}
