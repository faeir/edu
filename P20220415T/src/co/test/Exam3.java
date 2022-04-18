package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
 
public class Exam3 {
	public static void main(String[] args) {

		int[] intAry = new int[10];
		int[] avgAry = new int[10];
		int sum = 0;
		for(int i = 0; i < intAry.length; i++) {
			int random = (int)(Math.random()*10)+1;
			intAry[i] = random;
			sum += intAry[i];
		}
		double avg = sum/10.0;
		System.out.println("무작위 수의 평균 값 :"+ avg);
		for(int j = 0; j < avgAry.length; j++) {
			int random2 = (int)(Math.random()*10)+1;
			if(random2 > avg) {
				avgAry[j] = random2;
				System.out.println("새로운 배열에서 평균 보다 높은 수 : " + avgAry[j]);
			}
		}
		
	}
}
