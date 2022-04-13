package co.edu.array;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] intAry = {78, 83, 88, 92, 63};
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		// 합을 구하시오
		// 더블 평균
				
		for (int i = 0; i < 5; i++) {
			if (intAry[i] % 2 == 0 ) {
			sum += intAry[i];
			cnt++; 
			}
			avg = sum/cnt;
		}
		System.out.println("합: " + sum);
		System.out.println("평균: "+ avg);
	}
}