package day02wrapperclasses;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		//int data tipinin max ve min degerlerini bulup ekrana yazdiriniz..
		//int in wrapperclasini kullanacagiz==Integer
		
		System.out.println(Integer.MAX_VALUE);    //Clasin icinde ki metotlara ulasmak icin clas isminden sonra . koymaliyiz ve listeden sec
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);   //wrapper cevreleyen demek..
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		Scanner scan = new Scanner(System.in);
		
		scan.close();

	}

}
