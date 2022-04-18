package co.test;

// 조건문과 반복문.
// 
// Math.random()을 사용해서 1  ~ 10사이의 임의의 수를 추출.(10번 반복작업 수행) 
// 2의 배수와 3의 배수의 합계를 각각 구하도록 하세요.
// 6의 경우에는 2와 3의 배수이므로 2의 배수와 3의 배수의 합계에 각각 더해지도록 하세요.
// 결과 - >2의 배수의 합 : 26 3의 배수의 합 : 27
public class Exam2 {
	public static void main(String[] args) {
		int sum2 = 0;
		int sum3 = 0;
		for(int i = 0; i < 10; i++) {
			int sum = (int)(Math.random()*10)+1;	
			
			if(sum % 2 == 0) {
				sum2 += sum;
			}
			if(sum % 3 == 0) {
				sum3 += sum;
			}
		}
		System.out.println("2의 배수의 합 >" + sum2);
		System.out.println("3의 배수의 합 >" + sum3);
		
	}
}
