package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		//Bolme islemi yapan bir program yazalim
		
		int num1 = 12;
		int num2 = 0;
		try {		// try-catch kullandik 
		System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("sifir ile bolme yapilmaz");
		}
		// ArithmeticException run time exceptiondur. Matematik hatasinda verir..
	}

}
