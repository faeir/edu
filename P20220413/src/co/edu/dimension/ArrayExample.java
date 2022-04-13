package co.edu.dimension;

public class ArrayExample {

	public static void main(String[] args) {
		// 1~3반 학급
		// 1반 : 3명 점수
		// 2반 : 4명 점수
		// 3반 : 2명 점수
		int sum = 0;
		double avg = 0;
		int[][] scores = 
			{			
				{59, 63, 72}//
				, {56, 77, 33, 24}//
				, {55, 76}// 
			};//
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				} // j값 반복 하여 SUM에 더하기
				avg = (double) sum / scores[i].length;
				System.out.println("합계 :" + sum);
				System.out.println("평균 :" + avg);
			} // 전체 반복 
		}
	}