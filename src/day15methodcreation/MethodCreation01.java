package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(toplama(3,5));
		System.out.println(carpma(4,5));
		System.out.println(bolme(6,2));
		System.out.println(cikarma(8,5));
		System.out.println(ust(2));
	}
	
	public static int toplama(int num1, int num2) {
		return	num1+num2;
	}
	public static int carpma(int num1, int num2) {
			return	num1*num2;		
	}
	
	public static int bolme(int num1, int num2) {
		return num1/num2;
	}
	public static int cikarma(int num1,int num2) {
		return num1-num2;
	}
	public static int ust(int num) {
		return num*num;
	}

}
