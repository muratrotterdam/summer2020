package day32abstraction;

public class TekKisilikOda extends Otel {

	public static void main(String[] args) {
	  TekKisilikOda musteri1 = new TekKisilikOda();
	  musteri1.kahvalti();
	  System.out.println("Tv Ucreti = " + musteri1.tv(5));
	  System.out.println(musteri1.wifi(1));

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz sandvictir");
		
	}
	public int tv(int saat) {
		return saat*2;
	}
}
