package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// 4 elemanli char bir array olusturun .
		// elemanlar yerlestirin.
		// Tum elemanlari for dongusu ile ekrana yazdirin.
		
	char arr1[] = new char[4];
	
	arr1[0] ='m';
	arr1[1] ='a';
	arr1[2] ='s';
	arr1[3] ='a';
	
	for(char i=0; i<4; i++) {
		
		
	}System.out.println(arr1);
	System.out.println(arr1[3]);

	// arrayin uzunlugunu bulmak icin arrayin uzunlugu.length yazmaliyiz.
	// stringlerde de length methodu kullanir ama stringlerde () ile kullanilir..
	
	System.out.println(arr1.length);
	System.out.println(arr1[arr1.length-1]); // son eleman bu sekilde alinir
	
	
	}

}
