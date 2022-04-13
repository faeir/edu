package co.edu.dimension;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
		
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scn.nextInt();
			
			if(selectNo == 1 ) {
				System.out.print("학생수>");
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				if (scores == null) {
					System.out.println("학생수를 지정해주세요");
					continue;
				}
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = scn.nextInt();
				}
						
			} else if (selectNo == 3) {
				if (scores == null) {
					System.out.println("필요한 값이 입력되지 않았습니다.");
					continue;
				}
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
						
			} else if (selectNo == 4) {
				if (scores == null) {
					System.out.println("필요한 값이 입력되지 않았습니다.");
					continue;
				}
				
				int max, sum;
				max = sum = 0;
				
				for(int i=0; i <scores.length; i++) {
					sum += scores[i];
					
					if(scores[i] > max ) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.printf("평균 점수: %.2f", (double) sum/scores.length);
				
			} else if (selectNo == 5) {
				run = false;
			}
		
	
	System.out.println("프로그램 종료");

	}
  }
}


