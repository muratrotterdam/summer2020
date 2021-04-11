package day17constructors;

public class Constructors01b {

	public static void main(String[] args) {
		
		Constructors01a araba1 = new Constructors01a();
		
		
		System.out.println("Aracin yeni rengi: " + araba1.color.replaceAll("Blue", "Green"));
		System.out.println(araba1.make.replaceAll("Toyota", "Volvo"));
		System.out.println("Aracin yeni fiyati: " + (araba1.price+500));
		
		
	}

}
