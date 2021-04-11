package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		//if else if...Kullanicidan yasini alin..
		//yas 13 den az ise calisama mesaji verin
		//yas 13 den 65 kadar ise calisabilir 
		//yas 65 den yukari ise emekli yazdiralim
		// negatif girerse yas negatif olamaz yasin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas = scan.nextInt();
		if(yas<0) {
			System.out.println("Yas negatif olamaz");
		}else if(yas<13) {
			System.out.println("Calisamaz");		
		}else if(yas<=65) {	
			System.out.println("Calisabilir");
		}else 
			System.out.println("Emekli");
			
scan.close();
	}
}
