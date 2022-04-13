package co.edu.array;

public class ArrayExample4 {

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;		
		int avg = 0;
		int[] intAry = new int[5];//
				
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int)(Math.random() * 30) + 1; // 정수 1 ~ 30 범위의 임의 값.
		}
		for (int i = 0; i < intAry.length; i++)
			if (intAry[i] > 15) {
				System.out.println(intAry[i]);
				sum += intAry[i];
				cnt++;
				avg = sum / cnt;
			}
		System.out.println("합" + sum);
		System.out.println("평" + avg);
		
	}
}