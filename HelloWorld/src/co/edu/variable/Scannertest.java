package co.edu.variable;

import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3, sum, max;
		double avg;
		
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		sum = (num1 + num2 + num3);
		avg = sum / 3.0;
		max = 0;
		if (num1 > num2 ) {
			max = num1;
		}else {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.printf("세 점수의 합은 %3d점이고 평균은 %.2f점이며 최고점은 %2d점입니다", sum, avg, max);
	}

}
