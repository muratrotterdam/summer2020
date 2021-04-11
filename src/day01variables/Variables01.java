package day01variables;		//package ve proje isimleri kucuk harfle baslar klas da buyuk harfle baslar

public class Variables01 {
	
	public static void main(String[] args) {
		
		int maas=100;
		char masal='A';     //variable isimleri kucuk harfle yazilir
							//birden fazla isim vereceksek ilk isim basharfi kucuk diger kelime ilk harfi--
							//--buyuk olacak mesela muratBey ve isimler arasi bosluk yok
		
		
		System.out.println(maas);
		System.out.println(masal);
		
		boolean isOld=true;    //boolean lar icin sadece true veya false degerleri kullanilir
		
		System.out.println(isOld);
		
		boolean isNew=false;
		
		System.out.println(isNew);
		
		
		byte derinlik = -123;     //byte -128 den 127 ye kadar kullanilir bu sayilar dahil
		System.out.println(derinlik);
		
											// esittir den sonra sayi kullanacaksak bosluk verelim
		short nazilliNufus = 28000;
		
		System.out.println(nazilliNufus);
		
		//byte kucuk sayilar icin kullanilir..mesela ogrenci yaslari
		//short koy nufuslarin icin kullanilir
		
		long hucreSayisi = 1203930787678657l;   //long sayilarda sayi buyukse sonuna l koyariz     
		
		System.out.println(hucreSayisi);
		
		double piSayisi = 3.1417653492;          // kesirli sayilarda virgul degil nokta kullanilir
												 // buyuk kesirli sayilarda double kullanilir
		System.out.println(piSayisi);
		
		float para = 5.25f;
		
		System.out.println(para);				// kucuk kesirli sayilarda degerin yanina f koyulur
		
												// java da 8 tane primitief data vardir. 6 tanesi sayi
												// 2 tanesi karakter (char ve boolean)
		
		String sehirAdi = "Rotterdam";			//String charlarin birlesmesidir
		
		System.out.println(sehirAdi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
