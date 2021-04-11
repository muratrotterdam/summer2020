package day26encapsulation;

public class Encapsulation02 {
	//  getter ve setter kisa yoldan uretme..
	
	private char ilkHarf = 'M';
	private double para = 23.20;
	private boolean emekli = false;
	
	// variableye atanan degerin degismesini istemiyorsaniz o variablenin setter olusturmamaliyiz.
	//                           okunmasini                               getter                 .
	// sadece getter kullanir hic setter kullanmazsak, variableler degistirilemez.Bu tarz classlara "immutable class" denir.
	//        setter              getter                           degerleri okunamaz.

	public static void main(String[] args) {
		 
		Encapsulation01 obj = new Encapsulation01();
        System.out.println(obj.getKimlikNo());
        obj.setKimlikNo("10000000000");
        System.out.println(obj.getKimlikNo());
		
	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}
	
	
	

}
