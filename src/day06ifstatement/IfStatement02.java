package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		// Bir int variable olustur.
		// Ve ona bir deger atayin.
		// Eger atadiginiz deger pozitif ise ekrana pozitif yazdirin degilse negatif yazdirin

		int num1 = 5;
		
		if (num1>0)	{
			System.out.println("pozitif");
		}
		
		if (num1<0) {
		System.out.println("negatif");
		
		}
		
		if (num1==0) {
			System.out.println("Notr");
		}
	}

}
