package co.edu.variable;

import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
		// 정수 입력 num1,2,3
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;		
		// 정수 연산 => 정수 
		double avg;
		String myName = "홍길동";
		int age = 10; 
		
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		
		avg = (num1 + num2 + num3) / 3.0;
		
		System.out.printf("입력한 세 정수는 %3d, %3d, %3d 이고 평균은 %.2f 입니다.",//
							num1, num2, num3, avg);
		
		//System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %2d", myName, avg, age);
		//결과값 : 입력한 세 정수는 10, 15, 15이고 평균은 13.333333이다
	}

}
