package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3 un carpim tablosunu ekrana yazdiran programi yaziniz.
	
		// for loop ile
		
		for(int i = 1; i<11; i++) {
			System.out.println("3x"+i+ "=" + (3*i));
		}
		System.out.println(" ");
	    // while ile 
		
		int num =1;
		while(num<11) {
			System.out.println("3x"+num+ "=" + (3*num));
			num++;
		}
		

  }
}
