package co.edu;

public class OpreatorExample3 {

	public static void main(String[] args) {
		//비교 연산자, 논리 연산자
		int num1 = 10;
		int num2 = 20; 
		
		if (num1 == num2) {
			System.out.println("두 수는 같습니다");
		}
		if (num1 != num2) {
			System.out.println("두 수는 다릅니다");
		}
		if (num1 >= num2 ) {
			System.out.println(num1 + "이 "+ num2 + "보다 큽니다.");
		}
		if ((++num1 % 2 == 0) & (num2++ % 2 == 0 )) {
			System.out.println("두 수는 짝수입니다.");
		} else {
			System.out.println("두 수가 다 짝수는 아닙니다.");		
		}
		System.out.println(num1 + ", " + num2);
		
		if ((++num1 % 2 == 0) | (num2++ % 2 == 0 )) {
			System.out.println("둘 중 하나는 짝수입니다.");
		} else {
			System.out.println("두 수가 다 홀수 입니다.");		
		}
		System.out.println(num1 + ", " + num2);
		
		System.out.println("프로그램 종료");
	}
}
