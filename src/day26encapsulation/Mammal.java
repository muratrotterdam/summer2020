package day26encapsulation;

public class Mammal extends Animal {

	public boolean dogum=true;
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Animal clasindan geldi: " + dog.age);
		System.out.println(dog.name);
		dog.eat();
		System.out.println(dog.dogum);
		dog.move();
		dog.feed();
		System.out.println(dog.sadik);
		dog.bark();

	}
	public void feed() {    // feed beslemek demek
		System.out.println("Cocuklarini besler..");
	}

}
