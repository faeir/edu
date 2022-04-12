package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int randomVal = (int) ((Math.random() * 10) + 1);
		while(isTrue) {
			System.out.println("숫자 입력 >");
			int userVal = scn.nextInt();
				if (userVal == randomVal) {
					System.out.println("입력 값 > " + userVal);
					System.out.println("랜덤 값 > " + randomVal);
					System.out.println("정답입니다");
					isTrue = false;
				} else if (userVal > randomVal) {
					System.out.println("입력 값 > " + userVal);
					System.out.println("입력값이 랜덤보다 큽니다");
				} else {
					System.out.println("입력 값 > " + userVal);
			 		System.out.println("입력값이 랜덤보다 작습니다");
			}
		}
		System.out.println("프로그램 종료");
	}
}

