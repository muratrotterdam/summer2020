package day16overloading;

public class Overloading01aa {

	public static void puanHesaplama(String isim , int puan) {
		System.out.println(isim + " adli kisinin "+ puan + " puani var");
	}
	public static void puanHesaplama(String isim) {
		System.out.println(isim+" adli kisinin hic puani yok");
	}
	public static void puanHesaplama(int puan) {
		System.out.println("isimsiz kisinin "+puan+" puani var");
	}
	
	
	public static void main(String[] args) {
		
		puanHesaplama("Murat",100);
		puanHesaplama("Ahmet");
		puanHesaplama(90);

	}

}
