package day06ifstatement;

public class IfStatement05 {

	public static void main(String[] args) {
		         // Bir tane String variable alalim ve gun ismini kucuk harflerle ata. eger bu hafta ici gunlerinden biri ise
			     // ekrana hafta ici yazsin degilse hafta sonu yazdirin
		
		String gun = "sali";
		
		if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||gun.equals("persembe") ||gun.equals("cuma")) {
			System.out.println("Hafta ici");
		}
		
		if(gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("Hafta sonu");
		}

	}

}
