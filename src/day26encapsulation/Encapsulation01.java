package day26encapsulation;

public class Encapsulation01 {
	
	
	private String kimlikNo = "27650287184";
	private int krediKartNo = 43729327;
	private boolean soguk = true;
	
	public static void main(String[] args) {
		// encapsulation data saklama (data-hiding) yontemidir..
		// encapsulation 2 stepte yapilir.
		//  1) datayi (variables ve metodlar) private yapmaliyiz.
		//  2) public olan getter() ve setter() metodlari uretmeliyiz.
		// getter() data'yi sadece okumamiza yarar, degisiklik yapamaz.
		// setter() datayi degistirmemize yarar.
		
	
	}
	// getter uretmek icin 
	// 1) access modifier public olmali
	// 2) return type variablenin return type ile ayni olmali
	// 3) metod ismi get+variable isimi seklinde olmali
	
	
	public String getKimlikNo() {
		return kimlikNo;
	}

	public int getKrediKartNo() {
		return krediKartNo;
	}
	
	// return type boolean ise metod ismi is ile baslar get kullanilmaz.
	public boolean issoguk() {
		return soguk;
	}
	// setter uretmek icin;
	// 1) access modifier public olmali
	// 2) mutlaka void olmali
	// 3) metod ismi "set+variable name" olmali
	// 4) parametre kullanilmali.
	// 5) setter metodlarin ismi booleanlar icin de set ile baslar.
	
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo = krediKartNo;
	}
	public void setSoguk(boolean soguk) {
		this.soguk = soguk;
	}
}
