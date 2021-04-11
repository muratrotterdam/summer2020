package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// elemanlari 1,2,3,4,5 olan bir int array olusturunuz.
		// bu arrayda 3 elemaninin olup olmadigini kontrol ediniz.
		// 3 varsa ekrana "3 var" yazdirin.
		// 3 yoksa ekrana "3 yok" yazdirin.
		
		// Array olusturup eleman ekleme 1.yol
		
//		int arr[] = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		// Array olusturup eleman ekleme 2.yol
		
		int arr[] = {1,2,3,4,5};
		
		int count=0; //(flag) denir
		
		for(int i=0; i<5; i++) {
			if(arr[i]==3) {
			count++;
			}
			
			
		}
		if(count>0) {
			System.out.println("3 var");
		}else {
			System.out.println("3 yok"); // kac tane oldugunu ogrenmez istersek basina count yazilir.
		}
		
		
		
		
		

	}

}
