package co.edu.loop;

public class ForExample2 {

	public static void main(String[] args) {
		// 31번째 종료
		int sum = 0;
		 
		for (int i = 1; i <=100; i++) {
			if (i == 31) {
				break;
			}
			if (i % 2 == 0) { 
				System.out.println("현재 1의 값 => " + i);
				continue; // 구문 아래 코드 실행 없이 다음 순번(일종의 스킵 걔념)
			}
			sum += i;
		}
		System.out.println("sum => " + sum);
	}
}
