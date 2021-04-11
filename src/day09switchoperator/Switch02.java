package day09switchoperator;

public class Switch02 {

	public static void main(String[] args) {
		// Kullanici haftanin gun numarasini girsin. Programiniz gunun ismini yazsin.
		
		int gun = 1;
		
		switch(gun) {
			case 1:
				System.out.println("Pazartesi");
				break;
			case 2:
				System.out.println("Sali");
				break;
			case 3:
				System.out.println("Carsamba");
				break;
			case 4:
				System.out.println("Persembe");
				break;	
			case 5:
				System.out.println("Cuma");
				break;
			case 6:
				System.out.println("Cumartesi");
				break;	
			case 7:
				System.out.println("Pazar");
				break;	
			default :
			System.out.println("Yanlis Gun Girdiniz");
				
				
		}

	}

}
