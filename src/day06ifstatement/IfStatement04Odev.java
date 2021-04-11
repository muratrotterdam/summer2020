package day06ifstatement;



public class IfStatement04Odev {

	public static void main(String[] args) {
		//  bir char variable olusturun ve kucuk harf atayin.. 
		// eger atanan deger haftanin herhangi birinin ilk harfi ise o gunleri yazdirin
		// eger atanan deger ..... degilse boyle bir gun yok yazsin

		char day = 'a';
		
		if(day=='p') {
			System.out.println("pazar,pazartesi,persembe");
			
		}
		
		if(day=='s') {
			System.out.println("sali");
		}
		if(day=='c') {
			System.out.println("carsamba,cuma,cumartesi");
		}
		if(day!='p' && day!='s' && day!='c') {
			System.out.println("Boyle bir gun yok");
			
		}
		
	}

}
