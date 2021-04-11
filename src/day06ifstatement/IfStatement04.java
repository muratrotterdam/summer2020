package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		
			// bir char variable olusturun ve buyuk harf deger atayin.. 
			// eger atanan deger haftanin herhangi birinin ilk harfi ise o gunleri yazdirin
			// eger atanan deger ..... degilse boyle bir gun yok yazsin

		char gun = 'A';  //charlarda tek tirnak kullanilir
		
		if (gun=='P') {
			
			System.out.println("Pazar, Pazartesi , Persembe");
		}
		
		if (gun=='S') {
			System.out.println("Sali");
		}
		
		if (gun=='C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
		}
		
		
		if (gun!= 'P'&& gun!='S'&& gun!='C') {				//   || veya demek    && ve demek
			
		
			
			System.out.println("Boyle bir gun yok kocum"); 
		}
		
		
	}
	

}
