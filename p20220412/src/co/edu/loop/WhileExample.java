package co.edu.loop;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		while(isTrue) {
			System.out.println("숫자를 입력하세요. 종료시에는 -1을 입력해주세요 >");
			int temp = scn.nextInt();
			if(temp == -1) {
				isTrue = false;
				continue;
			}
			sum += temp;
		}
		System.out.println("입력값의 합은 " + sum + "입니다.");
	}
}
