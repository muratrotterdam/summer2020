package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca ilk harf , B harfini bulunca ikinci harf, C harfini bulunca
		// ucuncu harf, D harfini bulunca dorduncu harf yazdiran kodu  if-else-if ve switch 
		// kullanarak yazdirin.
		
      	char harf = 'D';
//		
//		if (harf=='A') {
//			System.out.println("Ilk Harf");
//		}else if(harf=='B') {
//			System.out.println("Ikinci Harf");
//		}else if(harf=='C') {
//			System.out.println("Ucuncu Harf"); 
//		}else if (harf=='D') {
//			System.out.println("Dorduncu Harf");
//		}else {
//			System.out.println("Bilmiyorum");
//		}
		
		switch(harf) {
		case 'A' : 
			System.out.println("Ilk Harf");
			break;
		case 'B' : 
			System.out.println("Ikinci Harf");
			break;
		case 'C' : 
			System.out.println("Ucuncu Harf");
			break;
		case 'D' : 
			System.out.println("Dorduncu Harf");
			break;	
		default :
			System.out.println("Bilmiyorum");
	
		}
	
		}

	}


