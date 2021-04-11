package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// While loop kullanarak ilk 5 sayma sayisinin toplamini yazdirin
		
		
		int sum = 0;  
		int num=1;  // baslangic yeri burasi
		
		while(num<=5) {   //bitis yeri burasi
			sum=sum+num;
			num++;		
		}System.out.println(sum);

	}

}
