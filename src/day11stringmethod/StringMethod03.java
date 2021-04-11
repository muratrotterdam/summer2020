package day11stringmethod;

public class StringMethod03 {

	public static void main(String[] args) {
		// concat() method iki stringi birlestirmenin yolu..ilk yol concatenation nun diger versiyonu
		
//		String str1 = "Ali";
//		String str2 = "Veli";
		
//		System.out.println(str1+str2);		// concatenation methodu
//		System.out.println(str1.concat(str2));	//concat methodu
//		
//		System.out.println(str1.concat(str2).concat(str1).concat(str2)); //istegin kadar ekleyebilirsin

		// replace() methodu bir karakterin yerine baska bir karakter yazmaya yarar.
		// ornegin 'ata' yazdik ama 'ana' ya cevirecez..
		
		
		// replace 1. version
//		String str3 = "ata";
//		
//		System.out.println(str3.replace("t","n"));
//		
//		System.out.println(str3.replace("a","u"));
//		System.out.println(str3.replace("x","o")); x olmadigi icin degisim yapmaz..
//		System.out.println(str3.replace("t","")); bir harfi silmek icin kullanir
		
		//replace 2. version
		
		//replaceFirst() methodu istedigimiz stringin ilk gorunumunu degistirir.
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K"));
		System.out.println(str4.replaceFirst("a", "e"));
		
		//Soru==> Butu aliler Veli olacak
		
		String text = "Ali okula gitti. Ali yemek yedi.Ali agladi";
		
		System.out.println(text.replace("Ali", "Veli"));
		
		
		System.out.println(text.replaceAll("Ali", "Murat"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
