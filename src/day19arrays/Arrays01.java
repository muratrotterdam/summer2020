package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// int Array olusturalim
		
     	int arr1[] = new int[5];
//		System.out.println(arr1[4]);   // [] yapar ve icine index koyarsak orda ki degeri goruruz
		
		// char ile biz yapak
		
	//	char arr2[] = new char[4];
	//	System.out.println(arr2);
		
		arr1[0] = 12;
//		System.out.println(arr1[0]);
//		
		arr1[4] = 22;
//		System.out.println(arr1[4]);
//		
		arr1[1] = 3;
//    	System.out.println(arr1[1]);
//		
		arr1[2] = 16;
//		System.out.println(arr1[2]);
//		
		arr1[3] = 52;
//		System.out.println(arr1[3]);
//		
		
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
		
		}
		
// Array de olmayan indexe deger atarsak "ArrayIndexOutofBoundsException" hatasi aliriz..		
		

	}

}
