package co.edu.variable;

public class VarExample5 {

	public static void main(String[] args) {
		int val = 10; // 4 * 1byte = 8 * bit; on/off 값을 담을 수 있는 공간
	
		System.out.println(Integer.MAX_VALUE);
		
		long val2 = 2147483648L;
		long val3 = 10; // 10 -> long 타입으로 변환(promotion:자동형변환).
		
		int val4 = (int)10L; // long -> int (casting : 강제형변환)
		
		int result = (int)(100L / 5);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(result);
		
		long val5 = 10000000000L;
		long val6 = 10L;
		
		result = (int)(val5 - val6);
		System.out.println(result);
		
		char charLit = 97; // 0 ~ 65535 까지의 정수값에 문자를 대입.
		System.out.println(charLit++);
	}

}
