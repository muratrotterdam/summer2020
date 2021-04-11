package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() metodu atama yapmadan stringi degistirmez..mutlaka atama yapilmali
		
		StringBuilder str1 = new StringBuilder("animals");
      //str1 = str1.substring(3); hata verir cunku substring metodu string clasindan gelir str1 string degil stringbuilder'dir
								 // bu hatadan kurtulmak icin ya yeni bir string uretip atama yapariz yada 
								 // direk syso nun icine yazariz..
		String str2 = str1.substring(3);
		System.out.println(str2);
		
		System.out.println(str1.substring(1,4));
		
		// indexOf() metodu belli bir karakterin indexini return eder.
		
		System.out.println(str1.indexOf("m"));
		
		// length() metodu String clasindan gelir ve uzunlugunu return eder.
		
		System.out.println(str1.length());
		
		// insert() metodu istenen indexe istenen karakteri koymaya yarar.
		
		System.out.println(str1.insert(0,"m"));
		
		// delete() istenen indexteki karakteri siler
		
		System.out.println(str1.deleteCharAt(0));
		
		// reverse() metodu stringi tersten yazdirir.
		
		str1.reverse();
		System.out.println(str1);
		
		// toString() metodu StringBuilderi Stringe ceviri
		str1.toString();
		System.out.println(str1);
		
		
		
		

	}

}
