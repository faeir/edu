package co.edu.api;

public class WrapperExample {
	public static void main(String[] args) {
		
		//랩퍼클래스.
		//기본데이터 -> 참조데이터.
		//int, long, byte -> Integer, Long, Byte
		
		int n1 = 100;
		Integer n2 = 200; // 박싱 
		n1 = n2; //언박싱 - 같은 타입에서는 변환이 문제 없다
		byte b1 = n2.byteValue();
		System.out.println(b1);
		Float f1 = 12.3F;
		
		Integer.parseInt("100");
		Double.parseDouble("123.456");
	}

}
