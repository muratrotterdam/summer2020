package day26encapsulation;

public class Cat extends Mammal {

	public boolean clean = true; 
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.clean);
		cat.miyav();
		System.out.println(cat.age);
		System.out.println(cat.name);
		cat.eat();
		cat.move();
		System.out.println(cat.dogum);
		cat.feed();
		

	}
	public void miyav() {
		System.out.println("Kediler miyavlar");
	}
}
