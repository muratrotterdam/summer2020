package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		// 
		int num1 = 12;
		int num2 = 0;
		// finally her zaman calisir hata olsun olmasin 
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("0 ile bolme yapilamaz");
		}finally {
			System.out.println("Aferim sana..");
		}
	}

}
