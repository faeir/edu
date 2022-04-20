package co.edu.except;

public class NullPointerEX {
	public static void main(String[] args) {
		String str = "Hello";
		str = null;
		
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) { 
			System.out.println("null값을 참조합니다");
		}
		System.out.println("끝");
	}
}
