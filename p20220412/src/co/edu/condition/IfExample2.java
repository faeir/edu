package co.edu.condition;

public class IfExample2 {

	public static void main(String[] args) {
		int num = 10;
		
		// 2의 배수, 3의 배수, 2,3의 공통 배수인지
		
		if ((num % 2 == 0) && (num % 3 ==0)) {
			System.out.println(num + "는 2와 3의 공통 배수입니다");			
		} else if (num % 2 == 0) {
			System.out.println(num + "는 2의 배수입니다");
		} else if (num % 3 == 0) {
			System.out.println(num + "는 3의 배수입니다");
		} else {
			System.out.println(num + "는 2와 3의 배수가 아닙니다");
		}

	}

}
