package day06ifstatement;

public class IfStatement02Odev {

	public static void main(String[] args) {
		// Bir int variable olustur.
		// Ve ona bir deger atayin.
		// Eger atadiginiz deger pozitif ise ekrana pozitif yazdirin degilse negatif yazdirin
		
		int num = -6;
		
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num==0) {
			System.out.println("Notr");
		}
		if(num>0) {
			System.out.println("Pozitif");
		}

	}

}
