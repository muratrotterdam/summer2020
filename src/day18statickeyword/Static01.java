package day18statickeyword;

public class Static01 {
	
	static int en = 12;
	static int boy = 10;
	static int alan;
	
	
	static {
		alan = en*boy;
	}

	public static void main(String[] args) {
		
System.out.println(alan);
	}

}
