package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder bir classdir cunku buyuk harfle baslamis..String uretmeye ve manipule etmeye yarar.
		
		String str = "Ali";
		str.substring(1);
		System.out.println(str);   // String lerde degisim yapmak icin atama yapmak lazim.. str=str.substring(1) gibi..
		
		// 1. yol
		StringBuilder strBld1 = new StringBuilder("Ali");
		strBld1.append("Can"); //append metodu stringe ekleme yapar concatination gibi..
		
		System.out.println(strBld1);  // burda ise StringBuilder ile atama yapmadan degisim yapabiliyoruz

		// 2. yol
		
		StringBuilder strBld2 = new StringBuilder();  // bos bir string urettik
		strBld2.append("Ali Can");  // bos stringe ali can ekledim
		
		// 3. yol
		
		StringBuilder strBld3 = new StringBuilder(5); // Uzunlugu 5 karakter olan bir string urettik
		strBld3.append("Ali");
		strBld3.append("Kahraman");
		
	}

}
