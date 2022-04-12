package co.edu.loop;

public class ForExample3 {

	public static void main(String[] args) {
		//
		// 최초로 값이 1000보다 커지는 값
		int sum = 100;
		for (int i = 1; i <= 100; i++) {
			if (sum % i == 0) {
				System.out.println("100의 약수 => " + i);
			}
		}
	}
}

